//cf link: https://codeforces.com/problemset/problem/266/A
import java.util.Scanner;

public class StonesOnTheTable {
	static Scanner scanner = new Scanner(System.in);
	private static byte answer;

	static byte solve(byte n, String[] colorList) {
		// R=R -> 1, R!=B -> 0
		byte count = 0;

		for (int i = 0; i < colorList.length; i++) {
			for (int j = i + 1; j < colorList.length; j++) {
				if (colorList[i].equals(colorList[j])) {
					count++; // increment count by one if char is equal.
				}
				break; // move back to outer loop after incrementing count.
			}
		}
		
		answer = count;
		return answer;
	}

	public static void main(String[] args) {
		byte n = Byte.parseByte(scanner.nextLine());
		String[] colorList = new String[n];
		colorList = scanner.nextLine().split("");
		
		System.out.println(solve(n, colorList));
	}
}
