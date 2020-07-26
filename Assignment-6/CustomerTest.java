import java.util.Scanner;

public class CustomerTest {
	private static Scanner scan;
	
	public static void main(String[] args) throws InvalidInputException {
		Customer cust;
		try{
			scan = new Scanner(System.in);
			System.out.println("Enter customer number, name and category ");
			String cno = scan.next();
			String cname = scan.next();
			String category = scan.next();
			cust = new Customer(cno,cname,category);
		
			cust.validate(cno,cname,category);
		
			System.out.println("Customer ID : " + cust.getCustNo());
			System.out.println("Customer Name : " + cust.getCustName());
			System.out.println("Category : " + cust.getCategory());
		}
		catch(InvalidInputException i) {
			System.out.println(i.getMessage());
		}
	}
}
