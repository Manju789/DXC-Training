import java.util.Scanner;

public class CombinationFormula { //This class prints the value of nCr when values of n and r are given
	static int Factorial(int a) {
		int fact=1;
		for(int i=2;i <= a;i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for n and r ");
		int n = sc.nextInt();
		int r = sc.nextInt();
		int ncr = Factorial(n)/(Factorial(n-r)*Factorial(r));
		System.out.println("nCr = " + ncr);
		sc.close();
	}
}
