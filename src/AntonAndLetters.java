//cf link: https://codeforces.com/problemset/problem/443/A
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class AntonAndLetters {
	static Scanner scanner = new Scanner(System.in);

	static int solve(final String[] letters) {
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < letters.length; i++) {
			set.add(letters[i]);
		}
		int count = set.size();
		
		return count;
	}

	public static void main(String[] args) {
		String s = scanner.nextLine();
		if (s.equals("{}")) {
			System.out.println(0);
		} else {
			s = s.replaceAll("[^a-zA-Z0-9]", "");
			
			final String[] letters = s.split("");
			System.out.println(solve(letters));
		}
	}
}
