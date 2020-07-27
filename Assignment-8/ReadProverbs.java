package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadProverbs {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("M:\\File\\TopProverbs.txt"))) {
			String str;
			while((str=br.readLine())!=null)
					System.out.println(str);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
