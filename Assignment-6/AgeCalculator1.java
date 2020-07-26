package custExcep;

import java.util.Scanner;

public class AgeCalculator1 {
	public static int calculateAge(String str) {
		
		int d1 = Character.getNumericValue(str.charAt(6));
		int d2 = Character.getNumericValue(str.charAt(7));
		int d3 = Character.getNumericValue(str.charAt(8));
		int d4 = Character.getNumericValue(str.charAt(9));
		int year = d1*1000 + d2*100 + d3*10 + d4;
		
		return 2020 - year;
	}
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter DOB");
			String dob = scan.next();
			try {
				if(dob.matches("\\d{2}/\\d{2}/\\d{4}"))
					System.out.println("Age : " + calculateAge(dob));
				else
					throw new MyException("Date of Birth should be in dd/mm/yyyy format");
			}
			catch(MyException me) {
				System.out.println(me);
			}
		}
	}
}
