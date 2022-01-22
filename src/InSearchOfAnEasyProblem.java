//cf link: https://codeforces.com/problemset/problem/1030/A
import java.util.Scanner;

public class InSearchOfAnEasyProblem {
	private static String answer = "EASY";

	static String solve() {
		Scanner scanner = new Scanner(System.in);
		byte numberOfOpinions = Byte.parseByte(scanner.nextLine());

		String[] opinion = scanner.nextLine().split(" ");
		byte[] problems = new byte[numberOfOpinions]; // to store each people opinions.
		
		scanner.close();

		for (int i = 0; i < opinion.length; i++) problems[i] = Byte.parseByte(opinion[i]);
		for (int i = 0; i < problems.length; i++) {
			if (problems[i] == 1) { // there's hard {1} problem.
				answer = "HARD"; // then ans would be change to hard.
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solve());
	}
}
