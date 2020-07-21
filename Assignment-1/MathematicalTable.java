import java.util.Scanner;
public class MathematicalTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= sc.nextInt();
		System.out.println("Upto which number ");
		int u= sc.nextInt();
		for(int i=1;i<=u;i++)
			System.out.println(n + " * " + i + " = " + n*i);
		sc.close();
	}
}
