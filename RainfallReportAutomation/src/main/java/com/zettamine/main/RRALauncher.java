package com.zettamine.main;

import java.util.List;

import com.zettamine.rra.model.AnnualRainfall;
import com.zettamine.rra.service.AnnualRainfallService;
import com.zettamine.rra.service.AnnualRainfallServiceImpl;
import com.zettamine.rra.util.RainfallReport;

public class RRALauncher {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Suraj Kumar\\Desktop\\AllCityMonthlyRainfall.txt";
		List<AnnualRainfall> cityDetails = RainfallReport.generateRainfallReport(filePath);
		AnnualRainfallService annualRainfall = new AnnualRainfallServiceImpl();
		annualRainfall.saveAnnualRainfall(cityDetails);
		annualRainfall.retrieveMaxAnnualRainfall();

	}

}
