package patterns;

import java.util.Scanner;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i, j, k = 65;
		for (i = n; i >0; i--) {
			for (j = i; j >0; j--) {
				System.out.printf("%c",j+64);
			}

			System.out.println();
		}
	}

}
