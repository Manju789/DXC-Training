import java.util.Scanner;
public class PrimeNumber { //This class predicts whether the entered number is prime or not
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		sc.close();
		int temp=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				temp=1;
				break;
			}
		}
		if (temp==1)
			System.out.println(n + " is not a prime number");
		else
			System.out.println(n + " is a prime number");
	}
}
