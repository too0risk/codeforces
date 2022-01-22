import java.util.Scanner;                                                                                                             
import java.util.ArrayList;

public class BusToUdayland {
	static Scanner scn = new Scanner(System.in);
	private static String answer = "NO";
	
	static void solve(short n) {
		ArrayList<Character> pairOfSeats = new ArrayList<Character>(); // pair of seats per row
		byte count = 0;

		while (n > 0) {
			char[] seats = scn.next().toCharArray();			
			for (int i = 0; i < seats.length; i++) {
				for (int j = i + 1; j < seats.length; j++) {
					// if first both pair of seats is empty.
					if (count == 0 && seats[i] == 'O' && seats[j] == 'O') {
						// change pair of empty seats to '+'..'+' and answer would be change to YES
						answer = "YES";
						seats[i] = '+'; 
						seats[j] = '+';
						count++;
					}
					break;
				}
				pairOfSeats.add(seats[i]);
			}
			n--;
		}
		scn.close();
		System.out.print(answer);
		if (answer.equals("YES")) {
			short elements = 0;
			while (pairOfSeats.size() > elements) { 
				if (elements % 5 == 0) System.out.println("");
				System.out.print(pairOfSeats.get(elements)); 
				elements++; 
			}
		}
	}
	
	public static void main(String[] args) {
		short n = scn.nextShort();
		solve(n);
		scn.close();
	}
}