import java.util.Scanner;
public class SumOfDigitsOfNumber { // This class prints sum of digits of given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			sum += n%10;
			n=n/10;
		}
		System.out.println("The sum of digits of given number " + num + " is " + sum);
		sc.close();
	}
}
