package com.zettamine.rra.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rra.exceptions.InvalidCityPincodeException;
import com.zettamine.rra.model.AnnualRainfall;

public class RainfallReport {
	
	public static List<AnnualRainfall>generateRainfallReport(String filePath){                             {
		
		List<AnnualRainfall> RainFall = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			//String [] cityDetails = (String[]) lines.toArray();
			
			for(String s : lines) {
				System.out.println(s);
				String [] cityDetails =  s.split(",");
				if(validate(cityDetails[0])) {
					AnnualRainfall annualRainFall = new AnnualRainfall(Integer.parseInt(cityDetails[0]),cityDetails[1]);
					double monthlyRainfall [] = new double[cityDetails.length-2];
					for(int i = 0; i < cityDetails.length-2 ; i++ ) {
						monthlyRainfall[i] = Double.parseDouble(cityDetails[i+2]); 
					}
					annualRainFall.calculateAverageAnnualRainfall(monthlyRainfall);
					RainFall.add(annualRainFall);
				}
				else {
					throw new InvalidCityPincodeException();
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  return RainFall ;
	}
	
}
	public static  boolean validate(String cityDetails) {
		
		if(cityDetails.matches("[0-9]{5}")) {
			return true;
		}
		else {
			return false;
		}
	}
}
