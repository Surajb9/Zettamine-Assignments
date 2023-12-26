package com.zettamine.rra.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class AnnualRainfall {
	
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	
	
	public  void calculateAverageAnnualRainfall(double monthlyRainfall [] ) {
	  double sum = 0;
	  double avgAnnualRainfall = 0;
	  int count = 0;
	  for(double i : monthlyRainfall) {
		  sum = sum + i;
		  count++;
	  }
	  avgAnnualRainfall = sum / count; 
	  this.averageAnnualRainfall = avgAnnualRainfall;
	}


	public AnnualRainfall(int cityPincode, String cityName) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
	}
}
