package com.zettamine.rra.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zettamine.rra.dao.AnnualRainfallDAO;
import com.zettamine.rra.dao.AnnualRainfallDAOImpl;
import com.zettamine.rra.model.AnnualRainfall;

public class AnnualRainfallServiceImpl implements AnnualRainfallService {

	@Override
	public void saveAnnualRainfall(List<AnnualRainfall> annualRainfall) {
		AnnualRainfallDAO dao = new AnnualRainfallDAOImpl();
		int[] rowsAffected = dao.saveAnnualRainfall(annualRainfall);
		System.out.println(rowsAffected.length + "rows inserted successfully");
	}

	@Override
	public void retrieveMaxAnnualRainfall() {
		// TODO Auto-generated method stub
		AnnualRainfallDAO dao = new AnnualRainfallDAOImpl();
		List<AnnualRainfall> avgAnnualRainfall = dao.retrieveAnnualRainfall();
		List<Double>  avgRainfall = new ArrayList<>();
		for(AnnualRainfall rainFall :  avgAnnualRainfall) {
			avgRainfall.add(rainFall.getAverageAnnualRainfall());
		}
		double maxRainfall = Collections.max(avgRainfall);
	    System.out.println("City Details with Maximum Average Annual Rainfall");
	    for(AnnualRainfall rainFall :  avgAnnualRainfall) {
			if(rainFall.getAverageAnnualRainfall() == maxRainfall) {
				System.out.printf("City pincode : %19d \n", rainFall.getCityPincode());
				System.out.printf("City Name    : %20s \n", rainFall.getCityName());
				System.out.printf("Average Annual rainFall :    %.2f \n",rainFall.getAverageAnnualRainfall());
			}
		}
		
	}

}
