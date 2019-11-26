package Programming;

import java.util.Scanner;

public class letter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a="123***";
		int l=a.length();
		char c,b;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(i==0 || i==6)
				{
					 c=a.charAt(j);
					 System.out.print(c);
				}
				for(int k=5;k>=0;k--)
				{
					if(i+j==5)
					{
						 b=a.charAt(k);
						 System.out.print(b);	 
					}
					
					else
						System.out.print(" ");
				}
			}
			System.out.println();
			}
	}
}
