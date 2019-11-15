package tutorial;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int t=a;
		int f=a;
		int i=0;
		int m=0;
		double n=0;
		while(t!=0)
		{
			i++;
			t=t/10;
		}
		t=a;
		while(t!=0)
		{
			m=t%10;
			n=n + Math.pow(m,i);
		t=t/10;
		}
		if(n==f)
			System.out.print("Yes");
		else
			System.out.print("Not");

	}

}
