import java.util.Scanner;

class Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		System.out.println("The numbers between the range "+ n1 + " and " + n2 + " are");
		for(int i=n1+1;i<n2;i++)
		{
			System.out.print(i + "  ");
		}
	}
}