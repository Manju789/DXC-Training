import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicateElements { //This class removes duplicate elements by copying unique elements to another array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		int[] a = new int[20];
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		sc.close();
		int[] temp = new int[n];
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j]) {
					a[j] = a[n-1];
					n--;
					j--;
				}
			}
		temp = Arrays.copyOf(a, n);
		System.out.println("The array with unique elements is ");
		for (int i = 0; i < n-1; i++) 
			System.out.print(temp[i] + " , ");
		System.out.print(temp[n-1]);
	}
}
