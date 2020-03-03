package com.statestree.client;

import com.statestree.beans.FlightData;
import com.statestreet.dao.FlightDataDao;

public class Application {
	public static void main(String[] args) {
		FlightDataDao dao = new FlightDataDao(); 
		
		
		
		for(FlightData temp : dao.getAllRecords()) {
			System.out.println(temp.getFlyFrom() +", " + temp.getFlyTo());
		}
	}
}
