//cf link: https://codeforces.com/problemset/problem/977/A
import java.util.Scanner;

public class WrongSubtraction {
	static int solve(int n, int k) {
		for (int i = 0; i < k; i++) {
			if (n % 10 == 0) {
				n /= 10;
			} else {
				n--;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] s = scn.nextLine().split(" ");
		int[] in = new int[s.length];
		scn.close(); 

		for (int i = 0; i < s.length; i++) in[i] = Integer.parseInt(s[i]);
		
		int n = in[0]; int k = in[1];
		
		System.out.println(solve(n, k));
	}
}
