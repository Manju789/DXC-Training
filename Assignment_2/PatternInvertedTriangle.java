import java.util.Scanner;

public class PatternInvertedTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int t = n;
		sc.close();
		while(n>0) {
			for(int i=1;i<=n;i++){
				if(i<n)
					System.out.print(i + "	");
				else {
					for(i=n;i>0;i--)
						System.out.print(i + "	");
					break;
				}
			}
			System.out.print("\n");
			for(int j=t-(n-1);j>0;j--)
				System.out.print("	");	
			n--;
		}
	}
}
