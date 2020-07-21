import java.util.Scanner;

public class PatternLeftTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		sc.close();
		while(n>0) {
			for(int i=1;i<=n;i++){
				System.out.print(i+"	");
			}
			System.out.print("\n");
			n--;
		}
	}
}
