package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocumentFormatter {
	private static BufferedReader br;
	private static PrintWriter pw;

	public static void main(String[] args) throws IOException{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the name of the file to be created ");
			String file = scan.next()+".txt";
			File fil = new File(file);
			fil.createNewFile();
			br = new BufferedReader(new FileReader("M:\\File\\Document.txt"));
			pw = new PrintWriter(fil);
			String str;
			while((str=br.readLine())!=null) {
				str = str.trim().replaceAll("\\s+", " ");
				pw.write(str);
				pw.flush();
			}
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
}
