package interviewquestions;

import java.util.*;

public class perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any integer");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not Perfect number");
		}
	}

}
