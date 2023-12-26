package com.zettamine.rra.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rra.model.AnnualRainfall;

public class AnnualRainfallDAOImpl implements AnnualRainfallDAO {
   
	
	static Connection con = DBHandler.establishConnection();
	static Statement st ;
	static {
		try {
			st = con.createStatement();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	@Override
	public  int[] saveAnnualRainfall(List<AnnualRainfall> annualRainfall) {
		
		String sql = "create table AnnualRainfall (city_pincode int primary key,city_name varchar,average_annual_rainfall decimal) ";
		try {
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int [] rowsAffected = null;
		for(AnnualRainfall a : annualRainfall ) {
			try {
				st.addBatch("insert into AnnualRainfall values("+a.getCityPincode()+",'"+a.getCityName()+"',"+a.getAverageAnnualRainfall()+")");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			rowsAffected = st.executeBatch();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rowsAffected;	
	}

	@Override
	public List<AnnualRainfall> retrieveAnnualRainfall() {
	
		 List<AnnualRainfall> RainfallList = new ArrayList<>();
		 String sql = "Select * from AnnualRainfall";
		 try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				String City_PinCode = rs.getString(1);
				String City_name = rs.getString(2);
				String AvgAnnualRainfall = rs.getString(3);
				AnnualRainfall annualRainFall = new AnnualRainfall(Integer.parseInt(City_PinCode),City_name,
						                                           Double.parseDouble(AvgAnnualRainfall));
				RainfallList.add(annualRainFall);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block.
			e.printStackTrace();
		}
		 
		 return RainfallList;
	}

}
