import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {

	private static Integer maxScore;

	public static int getMaxScore() {
		return maxScore;
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 player's name and their score");
		for(int i=0; i < 5 ; i++) {
			String name = scan.next();
			int score = scan.nextInt();
			map.put(name, score);
		}
		scan.close();
		maxScore = 0;
		int totScore = 0;
		System.out.println("Players who batted ");
		for (String m : map.keySet()) 
			System.out.println(m);
		System.out.println("Scores by players ");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.print(m.getKey() + " : ");
			System.out.println(m.getValue());
			if(maxScore < m.getValue())
				maxScore = m.getValue();
			totScore += m.getValue();
		}
		String str = null;
		for (Map.Entry<String, Integer> m : map.entrySet()) { 
			if (maxScore. equals(m.getValue()))
				str = m.getKey();
		}
		 
		System.out.println("Total Score : " + totScore);
		System.out.println("Name of Highest Scorer : " + str);
		System.out.println("Runs Scored by Dhoni : " + map.get("Dhoni"));
	}

}
