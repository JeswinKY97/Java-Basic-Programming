package tutorial;

import java.util.*;

public class Facepattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		char m;
		int i, j;
		for (i = 1; i <= n.length() + 1; i++) {
			for (j = 1; j <= n.length() + 1; j++) {
				if (i == 1 && j == 1 || i == 4 && j == 4) {
					m = n.charAt(0);
					System.out.print(m);
				}

				else if (i == 1 && j == 3 || i == 4 && j == 2 || i == 3 && j == 1 || i == 2 && j == 4) {
					m = n.charAt(2);
					System.out.print(m);
				} else if (i == 1 && j == 2 || i == 4 && j == 3 || i == 2 && j == 1 || i == 3 && j == 4) {
					m = n.charAt(1);
					System.out.print(m);
				} else if (i == 1 && j == 4 || i == 4 && j == 1) {
					m = n.charAt(3);
					System.out.print(m);
				}

				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
