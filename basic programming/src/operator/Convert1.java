package operator;

import java.util.Scanner;

public class Convert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b= a%10;
		int d=a/100;
		int c=b*b;
		int e=d*b;
		int f=c*e;

		System.out.printf("%d%d\n",c,e);
		System.out.println(f);
		
	}

}
