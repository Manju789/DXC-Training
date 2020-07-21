import java.util.Scanner;

public class PrimeNumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms ");
		int n = sc.nextInt();
		int i=3,count=1;
		System.out.print("2");
		while(count<n) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=1;
					break;
				}
			}
			
			if(temp==0) {
				System.out.print(" , " + i);
				count++;
			}
			i++;
		
		}
		sc.close();
	}
}
