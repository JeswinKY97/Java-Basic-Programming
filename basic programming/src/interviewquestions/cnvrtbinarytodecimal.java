package interviewquestions;

import java.util.Scanner;

public class cnvrtbinarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-gentem.in) method stub

		Scanner s = new Scanner(System.in);
		int sum = 0;
		int result;
		String a = s.next();
		for (int i = a.length() - 1; i >= 0; i--) {
			result = (int) Math.pow(2, i);
			if (a.charAt(i) == '1')
				sum = sum + result;
		}
		System.out.println(sum);
	}

}
