package patterns;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a=s.next();
		int l=a.length();
		char c[]=a.toCharArray();
		
		int i, j;
		for (i = 0; i <l; i++) {
			for (j = 0; j <=i; j++) {
				
				System.out.printf("%c",c[j]);
			}
 
			System.out.println();
		}
	}

}
