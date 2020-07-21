import java.util.Scanner;
public class NumberOfDaysInMonth { //This class prints the number of days in a month of specific year.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month name ");
		String month = sc.next();
		System.out.println("Enter the year number ");
		int year = sc.nextInt();
		if(month.equalsIgnoreCase("february")) {
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				System.out.println("The number of days in " + month + " : 29");
			else
				System.out.println("The number of days in " + month + " : 28");
		}
		else if((month.equalsIgnoreCase("january")) || (month.equalsIgnoreCase("march")) || (month.equalsIgnoreCase("may")) || (month.equalsIgnoreCase("july")) || (month.equalsIgnoreCase("august")) || (month.equalsIgnoreCase("october")) || (month.equalsIgnoreCase("december")))
			System.out.println("The number of days in " + month + " : 31");
		else
			System.out.println("The number of days in " + month + " : 30");
		sc.close();
	}
}
