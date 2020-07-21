import java.util.*;
public class FactorialOfANumber1 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number till which the factorial has to be displayed:");
		int number = scanner.nextInt();
		int factorial = 1;
		for(int i=1;i<=number;i++)
		{
			factorial *= i;
			if(factorial == 1 || factorial == 2 )
			{
				System.out.println("Factorial of "+i+":"+factorial+" is neither prime nor odd number");
			}
			else
			{
				for(int k=2;k<factorial;k++)
				{
					if(factorial%k == 0)
						count++;
					break;
				}
				if(count>0)
					System.out.println("Factorial of "+i+":"+factorial+" is not a prime number");
				else
					System.out.println("Factorial of "+i+":"+factorial+" is a prime number");
			}
		}

	}

}




