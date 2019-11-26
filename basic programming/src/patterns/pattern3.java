package patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int i, j;
		for (i = 0; i < number; i++) {
			System.out.print(" ");
		}
		for (j = 0; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();

	}

}
