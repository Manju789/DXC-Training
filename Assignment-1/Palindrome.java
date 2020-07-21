import java.util.Scanner;
public class Palindrome { // This class prints whether the given number is palindrome or not.
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
		if(rev == number)
			System.out.println("The given number " + number + " is a palindrome.");
		else
			System.out.println("The given number " + number + " is not a palindrome.");
		sc.close();
	}
}
