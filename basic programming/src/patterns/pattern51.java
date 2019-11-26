package patterns;

import java.util.Scanner;

public class pattern51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n*2)+1;j++)
			{
				if(i+j==5 || j-i==5)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}


package exceptionhandling;

public class error4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {1,2,3,4};
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

