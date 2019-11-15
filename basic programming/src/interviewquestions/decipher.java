package interviewquestions;

import java.util.Scanner;

public class decipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char a=s.next().charAt(0);
		System.out.println("Enter the number");
		int b=s.nextInt();
		int c=(int)a;
		int d=c-b;
		System.out.println((char)d);
	}

}
