package patterns;

import java.util.Scanner;

public class pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,c;
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=2*i;j++)
			{
				System.out.print("*");
				c++;
				if(c==i)
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}

}
