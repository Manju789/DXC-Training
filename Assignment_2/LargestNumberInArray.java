import java.util.Scanner;

public class LargestNumberInArray {
	public static int getLargest(int[] b,int m) {
		int max = b[0];
		for(int i=1;i<m;i++)
			if(b[i]>max) 
				max = b[i];
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers ");
		int a[] = new int[10];
		for(int i=0;i<10;i++)
			a[i] = sc.nextInt();
		
		int max = getLargest(a,10);
		System.out.print("The largest number is " + max);
		sc.close();
	}
}
