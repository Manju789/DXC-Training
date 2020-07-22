public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println( num1/num2);
		}
		catch(ArithmeticException ae) {
			System.out.println("Division with zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException exception ) {
			System.out.println("No Input received");
		}
		catch(NumberFormatException exception) {
			System.out.println("Only integers are allowed");
		}
	}

}
