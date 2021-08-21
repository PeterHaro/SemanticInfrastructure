package no.sintef.transformer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import no.sintef.datamodels.WaterObserved;
import no.sintef.datamodels.WaterQualityObserved;
import no.sintef.datamodels.generic.Location;
import no.sintef.input.Alert;
import no.sintef.input.Alert.MeasurementResult;

public class Transformer {

	//test
	public static void main(String[] args) throws IOException {

		
		//Testing WaterObserved
		List<WaterObserved> records = transformToWaterObserved("./files/EDEN.csv");


		PrintWriter writer = null;
		File outputFile = null;
		String output = null;
		
		//generate json output
		for (WaterObserved wo : records) {
			String id = wo.getId();
			outputFile = new File("./files/payloads/WaterObserved/" + id + ".json");
			output = new GsonBuilder().create().toJson(wo);
			
			writer = new PrintWriter(
					new BufferedWriter(
							new FileWriter(outputFile)), true);
			
			writer.write(output);
			writer.flush();
			writer.close();
			
		}
	
		//Testing WaterQualityObserved
		String alertFile = "./files/Alert_test.json";

		WaterQualityObserved wqo = transformToWaterQualityObserved(alertFile);
		
		Location loc = wqo.getLocation();
		double[] coordinates = loc.getCoordinates();
		
		System.out.println("Id: " + wqo.getId());
		System.out.println("Latitude: " + coordinates[0]);
		System.out.println("Longitude: " + coordinates[1]);
		System.out.println("E.coli: " + wqo.getEcoli());
		System.out.println("Temperature: " + wqo.getTemperature());
		
		
		//Testing WeatherObserved

	}


	public static List<WaterObserved> transformToWaterObserved (String csvInput) throws IOException {

		//WaterObserved wo;
		List<WaterObserved> waterObservedData = new LinkedList<WaterObserved>();

		BufferedReader br = new BufferedReader(new FileReader(csvInput));

		String line = br.readLine();
		String[] params = null;

		Location loc;	
		String measurementType = null;
		
		double lat, lon, measurementValue;

		while (line != null) {

			params = line.split(" ");

			lat = Double.parseDouble(params[3]);
			lon = Double.parseDouble(params[4]);
			
			double[] coordinates = new double[2];
			
			coordinates[0] = lat;
			coordinates[1] = lon;			
			
			loc = new Location.LocationBuilder()
					.setType("Point")
					.setCoordinates(coordinates)
					.build();

			measurementType = getMeasurementType(params[0]);
			measurementValue = getMeasurementValue(params[0]);


			if (measurementType.equals("flow")) {

				WaterObserved wo = new WaterObserved.WaterObservedBuilder()
						.setId(generateUUID())
						.setType("WaterObserved")
						.setSource("EDEN")				
						.setDateObserved(params[2])
						.setLocation(loc)
						.setFlow(measurementValue)
						.build();

				waterObservedData.add(wo);
				line = br.readLine();

			} else if (measurementType.equals("height")) {

				WaterObserved wo = new WaterObserved.WaterObservedBuilder()
						.setId(generateUUID())
						.setType("WaterObserved")
						.setSource("EDEN")				
						.setDateObserved(params[2])
						.setLocation(loc)
						.setHeight(measurementValue)
						.build();

				waterObservedData.add(wo);
				line = br.readLine();


			} else if (measurementType.equals("dischargeAmount")){

				WaterObserved wo = new WaterObserved.WaterObservedBuilder()
						.setId(generateUUID())
						.setType("WaterObserved")
						.setSource("EDEN")				
						.setDateObserved(params[2])
						.setLocation(loc)
						.setDischargeAmount(measurementValue)
						.build();

				waterObservedData.add(wo);
				line = br.readLine();

			}

		}

		br.close();
		
		return waterObservedData;

	}


	//TODO: Just mocking this, get info on how to interpret these values from SIAAP
	private static double getMeasurementValue (String tagValue) {

		String value = tagValue.substring(tagValue.indexOf("=")+1, tagValue.length());

		double measurementValue = Double.parseDouble(value.replace(",", "."));

		return measurementValue;

	}

	public static WaterQualityObserved transformToWaterQualityObserved (String jsonInput) {

		Gson gson = new Gson();

		WaterQualityObserved wqo = null;

		try (Reader reader = new FileReader(jsonInput)) {

			Alert alert = gson.fromJson(reader, Alert.class);

			List<MeasurementResult> mr = alert.getMeasurement_result();
			
			double[] coordinates = new double[2];
			coordinates[0] = alert.getLatitude();
			coordinates[1] = alert.getLongitude();

			Location location = new Location.LocationBuilder()
					.setType("Point")
					.setCoordinates(coordinates)
					.build();

			for (MeasurementResult mres : mr) {

			wqo = new WaterQualityObserved.WaterQualityObservedBuilder()
					.setId(Integer.toString(alert.getSample_id()))
					.setDateObserved(Integer.toString(alert.getDate()))
					.setLocation(location)
					.setTemperature(alert.getTemperature())
					.setEcoli(mres.getResult())
					.build();
			}


		} catch (IOException e) {
			e.printStackTrace();
		}

		return wqo;


	}
	
	//TODO: Just mocking this, get info on how to interpret these values from SIAAP
	private static String getMeasurementType (String tagValue) {

		String measurementType = null;
		if (tagValue.contains("_Q_")) {
			measurementType = "flow";
		} else if (tagValue.contains("_N_")) {
			measurementType = "height";
		} else if (tagValue.contains("_D_")) {
			measurementType = "dischargeAmount";
		}

		return measurementType;


	}
	
	private static String generateUUID() {
		
		UUID id = UUID.randomUUID();
		
		return id.toString();
	}




	//	
	//	public static WeatherObserved transformToWeatherObserved (String jsonInput) {
	//		
	//	}

}
