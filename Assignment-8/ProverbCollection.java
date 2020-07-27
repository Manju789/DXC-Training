package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter proverbs and type '0' to exit");
		String s = "";
		while(true) {
			s = scan.nextLine();
			if(s.equals("0"))
				break;
			else
				storeProverb(s);
		}
		scan.close();
	}
	static void storeProverb(String str) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("TopProverbs.txt",true));
		bw.write(str);
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
