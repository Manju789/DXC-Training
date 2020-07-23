import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		ScoreAnalyzer sa = new ScoreAnalyzer();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of batsmen :");
		int batsmenNo = scan.nextInt();
		
		for(int i=0; i<batsmenNo; i++) {
			System.out.println("Enter runs of batsman " + (i+1));
			sa.addRunsToList(scan.nextInt());
		}
		sa.displayRuns();
		System.out.println("\nRunrate : " + sa.calcRunRate());
		System.out.println("Lowest runs scored : " + sa.lowestRunsScored());
		System.out.println("Count of players who batted : " + batsmenNo);
		scan.close();
	}

}
