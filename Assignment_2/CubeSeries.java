import java.util.Scanner;

public class CubeSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms ");
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
			System.out.print(i*i*i + " , ");
		System.out.println(n*n*n);
		sc.close();
	}
}
