package com.zettamine.rra.dao;

import java.util.List;

import com.zettamine.rra.model.AnnualRainfall;

public interface AnnualRainfallDAO {
    int[] saveAnnualRainfall(List<AnnualRainfall> annualRainfall);
    List<AnnualRainfall> retrieveAnnualRainfall();
}
