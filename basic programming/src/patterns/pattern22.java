package patterns;

import java.util.*;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j, k = 65;
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i + 1; j++) {
				System.out.printf("%c", k++);
			}

			System.out.println();
		}
	}

}
