import java.util.*;
public class FactorialOfRangeOfNumbers { //This class prints factorials of all numbers from 1 to the given number and checks whether they are prime or not.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which the factorial has to be displayed:");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=1;i<=n;i++)
		{
			factorial *= i;
			if(factorial == 1 )
			{
				System.out.println("Factorial of "+i+" : "+factorial+" is not prime");
			}
			else if(factorial==2)
			{
				System.out.println("Factorial of "+i+" : "+factorial+" is a prime");
			}
			else
			{
				System.out.println("Factorial of "+i+" : "+factorial+" is not a prime number");
			}
		}
		sc.close();
	}
}
