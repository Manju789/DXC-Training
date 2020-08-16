package com.ticket;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TrainDAO {
	
	//private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private double ticketPrice;
	
	public Train findTrain(int tNo) {
		try {
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rs.setUsername("MD");
			rs.setPassword("manju");
			rs.setCommand("select * from TRAINS where TRAIN_NO="+tNo);
			rs.execute();
			
			rs.beforeFirst();
			while(rs.next()) {
				if(rs.getInt("TRAIN_NO") == tNo){
					//this.trainNo = rs.getInt("TRAIN_NO");
					this.trainName = rs.getString("TRAIN_NAME");
					this.source = rs.getString("SOURCE");
					this.destination = rs.getString("DESTINATION");
					this.ticketPrice = rs.getDouble("TICKET_PRICE");
					}
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return new Train(tNo, trainName, source, destination, ticketPrice);
	}
}
