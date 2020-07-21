import java.util.Scanner;
public class NumberOfCharactersInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.next();
		sc.close();
		int temp[]=new int[300];
		int length=str.length();
		for(int i=0;i<length;i++)
			temp[str.charAt(i)]++;
		char ch[]=new char[str.length()];
		for(int i=0;i<length;i++) {
			ch[i] = str.charAt(i); 
            int find = 0; 
            for(int j = 0; j <= i; j++)
            	if (str.charAt(i) == ch[j])  
                    find++;  
            if(find == 1)  
                System.out.println( str.charAt(i) + " ... " + temp[str.charAt(i)]); 
		}
	}
}
