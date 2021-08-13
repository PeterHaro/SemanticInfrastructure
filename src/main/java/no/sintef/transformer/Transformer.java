package no.sintef.transformer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import dwc.WaterObserved;
import dwc.WaterQualityObserved;
import dwc.WeatherObserved;

public class Transformer {
	
	public static WaterObserved transformToWaterObserved (String csvInput) throws IOException {
		
		WaterObserved wo;
		Set<WaterObserved> waterObservedData = new HashSet<WaterObserved>();
		
		BufferedReader br = new BufferedReader(new FileReader(csvInput));
		
		String line = br.readLine();
		String[] params = null;
		
		while (line != null) {
			params = line.split(" ");
			
			wo = new WaterObserved.WaterObservedBuilder()
					.setId("someId")
					.setType("WaterObserved")
					.setSource("EDEN")
					.setDateObserved(params[2])
					
			
			
		}
				
	}
	
	public static WaterQualityObserved transformToWaterQualityObserved (String jsonInput) {
		
	}
	
	public static WeatherObserved transformToWeatherObserved (String jsonInput) {
		
	}

}
