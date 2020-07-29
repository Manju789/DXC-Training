package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProverbReverser {

	private static BufferedReader br;
	private static BufferedWriter bw;

	static String reverseWord (String str) {
		String reverse = "";
		for(int i=str.length()-1 ; i>=0;i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			br = new BufferedReader(new FileReader("TopProverbs.txt"));
			bw = new BufferedWriter(new FileWriter("ReverseProverbs.txt",true));
			String line, word = null;
			while((line=br.readLine())!= null) {
				word = "";
				String[] words = line.split(" ");
				for(int i=0 ; i< words.length ;i++) {
					
					word += ProverbReverser.reverseWord(words[i]);
				}
				bw.write(word);
				bw.newLine();
				System.out.println(word);
			}
			
			br.close();
			bw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
