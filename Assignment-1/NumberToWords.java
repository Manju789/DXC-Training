import java.util.Scanner;
public class NumberToWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number less than 1000 ");
		int n=sc.nextInt();
		int n1=n;
		int[] a=new int[3];
		for (int i = 2; i >=0; i--) {
			a[i] = n%10;
			n = n/10;
		}
		sc.close();
		String[] number = new String[50];
		number[0]="One";
		number[1]="Two";
		number[2]="Three";
		number[3]="Four";
		number[4]="Five";
		number[5]="Six";
		number[6]="Seven";
		number[7]="Eight";
		number[8]="Nine";
		number[9]="Ten";
		number[10]="Eleven";
		number[11]="Twelve";
		number[12]="Thirteen";
		number[13]="Fourteen";
		number[14]="Fifteen";
		number[15]="Sixteen";
		number[16]="Seventeen";
		number[17]="Eighteen";
		number[18]="Nineteen";
		number[19]="Twenty";
		number[20]="Thirty";
		number[21]="Fourty";
		number[22]="Fifty";
		number[23]="Sixty";
		number[24]="Seventy";
		number[25]="Eighty";
		number[26]="Ninety";
		number[27]="Hundred";
		if(n1==0)
			System.out.println("Zero");
		else {
			if(n1<20)
				System.out.println(number[n1-1]);
			else {
				if(a[0]==0) {
					if(a[2]==0)
						System.out.println(number[17+a[1]]);
					else
						System.out.println(number[17+a[1]] + " " + number[a[2]-1]);
				}
				else {
					System.out.print(number[a[0]-1] + " " + number[27]+" ");
					if(a[2]==0)
						System.out.println(number[17+a[1]]);
					else
						System.out.println(number[17+a[1]] + " " + number[a[2]-1]);
				}
			}
		}
	}
}
