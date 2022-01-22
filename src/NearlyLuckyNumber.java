import java.util.Scanner;

public class NearlyLuckyNumber {
	static Scanner scanner = new Scanner(System.in);
	private static String answer;

	static String solve(int[] n) {
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 4 || n[i] == 7) count++;
		}
		answer = count == 4 || count == 7 ? "YES" : "NO";
		return answer;
	}

	public static void main(String[] args) {
		String[] in = scanner.nextLine().split("");
		int[] n = new int[in.length];
		for (int i = 0; i < in.length; i++) n[i] = Integer.parseInt(in[i]);
		System.out.println(solve(n));
	}
}