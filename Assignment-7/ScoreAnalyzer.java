import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	public ScoreAnalyzer() {
		
	}
	void addRunsToList(int runs) {
		runsData.add(runs);
	}
	double calcRunRate() {
		int totscore = 0;
		for(int i=0; i<runsData.size(); i++) {
			totscore += runsData.get(i);
		}
		return totscore/50;
	}
	int lowestRunsScored() {
		return Collections.min(runsData);
	}
	void displayRuns() {
		System.out.print("Runs scored : ");
		for(int j : runsData)
			System.out.print((runsData.indexOf(j)+1) + " - "+ j +  "	");
	}
}
