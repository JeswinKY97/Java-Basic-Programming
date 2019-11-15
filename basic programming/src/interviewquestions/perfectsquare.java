package interviewquestions;

import java.util.*;

public class perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double b = (int) Math.sqrt(a);
		if ((b * b) == a) {
			System.out.print("yes");
		} else
			System.out.print("No");
	}

}
