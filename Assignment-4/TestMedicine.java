package q5;

import java.util.*;

public class TestMedicine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Medicine[] medicine = new Medicine[5];

		Random random = new Random();

		for (int i = 0; i <= 2; i++) {

			switch(random.nextInt(2)+1) {
			case 1:
				medicine[i] = new Tablet();
				break;
			case 2:
				medicine[i] = new Ointment();
				break;
			case 3:
				medicine[i] = new Syrup();
				
			}
			
			System.out.println("Input Expiry date e.g 10-10-2020");
			medicine[i].setExpiryDate(scanner.next());
			System.out.println("Enter price");
			medicine[i].setPrice(scanner.nextDouble());
			System.out.println("\n");
			medicine[i].getDetails();
			medicine[i].displayLabel();
		}

		scanner.close();
	}
}
