import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		sc.close();
		for(int i=n;i>=1;i--){
			int j=i-1;
			while(j>0){	
				System.out.print("	");	
				j--;
			}
			int k=i;
			while(k<n)
			{
				System.out.print(k + "	");k++;
			}
			for(int m=n;m>=i;m--)
				System.out.print(m + "	");
			
			System.out.print("\n ");
		}
	}
}
