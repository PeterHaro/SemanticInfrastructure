package no.sintef.transformer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import no.sintef.datamodels.WaterObserved;
import no.sintef.datamodels.WaterQualityObserved;
import no.sintef.datamodels.WeatherObserved;
import no.sintef.datamodels.generic.Location;

public class Transformer {

	//test
	public static void main(String[] args) throws IOException {

		Set<WaterObserved> records = transformToWaterObserved("./files/EDEN.csv");

		System.out.println("Number of records: " + records.size());

		for (WaterObserved wo : records) {
			System.out.println("Id: " + wo.getId());
			System.out.println("Date observed: " + wo.getDateObserved());
			System.out.println("Flow: " + wo.getFlow());
			System.out.println("Height: " + wo.getHeight());
			System.out.println("Discharge amount: " + wo.getDischargeAmount());
			System.out.println("\n");
		}
	}



	public static Set<WaterObserved> transformToWaterObserved (String csvInput) throws IOException {

		WaterObserved wo;
		Set<WaterObserved> waterObservedData = new HashSet<WaterObserved>();

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
			loc = new Location.LocationBuilder()
					.setLatitude(lat)
					.setLongitude(lon)
					.build();
			
			measurementType = getMeasurementType(params[0]);
			measurementValue = getMeasurementValue(params[0]);


			if (measurementType.equals("flow")) {


				wo = new WaterObserved.WaterObservedBuilder()
						.setId("someId")
						.setType("WaterObserved")
						.setSource("EDEN")				
						.setDateObserved(params[2])
						.setLocation(loc)
						.setFlow(measurementValue)
						.build();

				waterObservedData.add(wo);
				line = br.readLine();

			} else if (measurementType.equals("height")) {

				wo = new WaterObserved.WaterObservedBuilder()
						.setId("someId")
						.setType("WaterObserved")
						.setSource("EDEN")				
						.setDateObserved(params[2])
						.setLocation(loc)
						.setHeight(measurementValue)
						.build();

				waterObservedData.add(wo);
				line = br.readLine();


			} else if (measurementType.equals("dischargeAmount")){

				wo = new WaterObserved.WaterObservedBuilder()
						.setId("someId")
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
	//TODO: Just mocking this, get info on how to interpret these values from SIAAP
	private static double getMeasurementValue (String tagValue) {

		String value = tagValue.substring(tagValue.indexOf("=")+1, tagValue.length());

		double measurementValue = Double.parseDouble(value.replace(",", "."));

		return measurementValue;

	}

	//	public static WaterQualityObserved transformToWaterQualityObserved (String jsonInput) {
	//		
	//	}
	//	
	//	public static WeatherObserved transformToWeatherObserved (String jsonInput) {
	//		
	//	}

}
