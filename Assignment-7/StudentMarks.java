import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<Integer>();
		int sum=0;
		System.out.println("Enter the number of students :");
		int stuNo = scan.nextInt();
		System.out.println("Enter their marks");
		for(int i=0; i<stuNo; i++)
			marks.add(scan.nextInt());
		scan.close();
		int maxmark = marks.get(stuNo-1);
		Iterator<Integer> itr = marks.iterator();
		while(itr.hasNext()) {
			int temp = itr.next();
			if(maxmark<temp)
				maxmark = temp;
			sum += temp;
		}
		double avg = sum/stuNo;
		System.out.println("Highest Marks : " + maxmark);
		System.out.println("Average Marks : " + avg);
		System.out.print("Marks : ");
		for(int i=0; i<stuNo; i++)
			System.out.print(i+1 + " - " + marks.get(i) +"	");
		System.out.println("\n3rd Student marks : " + marks.get(2));
		Collections.sort(marks);
		System.out.print("Sorted : ");
		for(int i=0; i<stuNo; i++)
			System.out.print(i+1 + " - " + marks.get(i) +"	");
	}

}
