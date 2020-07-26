import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class States {
	public static void main(String[] args) throws IOException {
		String str = null;
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		File file = new File("C:\\Users\\manju\\Desktop\\Java\\Assignment_7\\states.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		while((str = br.readLine()) != null)
			lhs.add(str);
		System.out.println("The number of states = " + (lhs.size()));
		lhs.remove("Delhi");
		System.out.println("The states which have name starting with K :");
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			str = itr.next();
			if(str.charAt(0)=='K')
				System.out.println(str);
		}
		System.out.println("The states in sorted order :");
		TreeSet<String> ts = new TreeSet<String>(lhs);
		System.out.println(ts);
		br.close();
		
	}
}
