import java.util.Scanner;
public class ArraySortingAscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers for sorting ");
		int a[] = new int[10];
		int temp = 0;
		for(int i=0;i<10;i++)
			a[i] = sc.nextInt();
		for(int i=0;i<10;i++)
			for(int j=i+1;j<10;j++)
			{
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		System.out.println("Ascending order :");
		for(int i=0;i<9;i++)
			System.out.print(a[i] + " , ");
		System.out.print(a[9]);
		sc.close();
	}
}
