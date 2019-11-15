package Switch;

import java.util.Scanner;

public class Fibanoccicheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int m=0;
		int c=0;
		for(int i=1;i<n*2;i++)
		{
			 c=a+b;
			if(c==n)
			{
				m++;
			}
		
			
			a=b;
			b=c;
		}
			if(m!=0)
			
				System.out.println("yes");
			
				else
					System.out.print("not");
			
			}
		
	}


