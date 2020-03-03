package com.statestreet.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.statestree.beans.FlightData;
import com.statestreet.connection.GetConnection;
import com.statestreet.day2.FligtTicketBookingTest;

public class FlightDataDao {
	
	public List<FlightData> getAllRecords(){
		String sql = "select flyfrom, flyto from fligtdata"; 
		List<FlightData> list = new ArrayList<FlightData>(); 
		
		
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql); 
			
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()) {
				FlightData temp = new FlightData();
				temp.setFlyFrom(gc.rs.getString("flyfrom"));
				temp.setFlyTo(gc.rs.getString("flyto"));
				
				list.add(temp); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
}
