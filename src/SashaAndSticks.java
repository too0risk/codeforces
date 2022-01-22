import java.util.Scanner;

public class SashaAndSticks {
	static Scanner scanner = new Scanner(System.in);
	private static String answer;

	static String solve(long n, long k) {
		// n = 10, k = 4... (1) 10 - 4 = Shasa 1.. (2) 6 - 4 = Lena 1.. break -> no more paper. If less than or equal, sasha doesnt WIN !.
		long res = n/k;
		answer = res % 2 == 0 ? "NO" : "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		long n = scanner.nextLong(), k = scanner.nextLong();
		System.out.println(solve(n, k));
	}
}