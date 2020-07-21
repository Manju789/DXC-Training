import java.util.Scanner;
public class ReverseOfNumber { //This class prints reverse of the given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int number=n;
		int rev=0;
		while(n!=0) {
			rev = rev*10 + n%10;
			n=n/10;
		}
		System.out.println("The reverse of given number " + number + " is " + rev);
		sc.close();
	}
}
