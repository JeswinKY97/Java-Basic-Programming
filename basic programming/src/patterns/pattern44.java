package patterns;

import java.util.Scanner;

public class pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++
				
		{
			for(int j=1;j<=n;j++)
			{
			if(i==j || j==n-i+1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}

}
