package com.ticket;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Train train;
		TrainDAO td = new TrainDAO();
		Date travelDate = null;
		Date currentDate = new Date();
		int noOfPassengers;
		System.out.println("Enter the Train Number");
		train = td.findTrain(scan.nextInt());
		scan.nextLine();
		
		if(train.equals(null))
			System.out.println("Train with given train number does not exist.");
		else {
			System.out.println("Enter date in the format DDMMYYYY");
			String travelDate1 = scan.nextLine();
			try {
				travelDate = new SimpleDateFormat("ddMMyyyy").parse(travelDate1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(travelDate.compareTo(currentDate)<0) {
				System.out.println("Travel date is before the current date and it should only be after current date.");
				System.exit(0);
			}
			else {
				Ticket ticket = new Ticket(travelDate, train);
				System.out.println("Enter number of passengers");
				noOfPassengers = scan.nextInt();
				scan.nextLine();
				for(int i=0; i<noOfPassengers; i++) {
					System.out.println("Enter passenger name");
					String name = scan.nextLine();
					System.out.println("Enter age");
					int age = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter gender(M/F)");
					char gender = scan.next().charAt(0);
					ticket.addPassenger(name, age, gender);
					scan.nextLine();
				}
				ticket.writeTicket();
			}
		}
		scan.close();
	}

}
