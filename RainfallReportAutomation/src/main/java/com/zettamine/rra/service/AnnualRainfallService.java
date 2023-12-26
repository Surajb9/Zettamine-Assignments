package com.zettamine.rra.service;

import java.util.List;

import com.zettamine.rra.model.AnnualRainfall;

public interface AnnualRainfallService {
        void saveAnnualRainfall(List<AnnualRainfall> annualRainfall);
        void retrieveMaxAnnualRainfall();
}
