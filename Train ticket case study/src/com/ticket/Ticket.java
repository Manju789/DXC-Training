package com.ticket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Ticket {
	private int counter=100;
	private String pnr;
	private Date travelDate;
	
	Train train;
	TreeMap<Passenger,Double> map = new TreeMap<Passenger, Double>();
	
	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}



	public TreeMap<Passenger,Double> getMap() {
		return map;
	}



	public void setMap(TreeMap<Passenger, Double> map) {
		this.map = map;
	}



	public String generatePNR() {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		String date = df.format(travelDate);
		pnr = train.getSource().charAt(0)+ train.getDestination().charAt(0) + "_" + date + counter;
		counter++;
		return pnr;
	}
	
	private double calcPassengerFare(Passenger p) {
		double fare, tPrice = train.getTicketPrice();
		if(p.getAge()<=12)
			fare = 0.5 * tPrice;
		else if(p.getAge()>=60)
			fare = 0.6 * tPrice;
		else if(p.getGender() == 'F')
			fare = 0.75 * tPrice;
		else
			fare = tPrice;
		return fare;
	}
	
	public void addPassenger(String name, int age, char gender) {
		Passenger p = new Passenger(name, age, gender);
		map.put(p, calcPassengerFare(p));
	}
	
	private double calculateTotalTicketPrice() {
		double total = 0;
		for(Map.Entry<Passenger, Double> m : map.entrySet())
			total += (double)m.getValue();
		return total;
	}
	
	public StringBuilder generateTicket() {
		StringBuilder str = new StringBuilder("PNR : ");
		str.append(generatePNR());
		str.append("\nTrain no : " + train.getTrainNo());
		str.append("\nTrain Name : " + train.getTrainName());
		str.append("\nFrom : " + train.getSource() + "\nTo : " + train.getDestination() + "Travel Date : " + travelDate);
		str.append("Passengers : \nName\t\tAge\tGender\tFare\n");
		for(Map.Entry<Passenger, Double> m : map.entrySet()) {
			str.append(m.getKey() + "\t" + m.getValue() + "\n");
		}
		str.append("Total Price " + calculateTotalTicketPrice());
		return str;
	}
	
	public void writeTicket() throws IOException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(generatePNR()+".txt"));
			bw.write(generateTicket().toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(bw != null)
				bw.close();
		}
	}
	
	
}
