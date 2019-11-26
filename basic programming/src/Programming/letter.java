package Programming;

import java.util.Scanner;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int i,j;
		if(c=='s' || c=='S')
		{
			for(i=0;i<6;i++)
			{
				for(j=0;j<6;j++)
				{
					if((i==1 && j==5) || (i==0 && j==4) || (i==0 && j==3) || (i==0 && j==2) || (i==1 && j==1)  || (i==2 && j==2) || (i==2 && j==3) || (i==3 && j==4) || (i==4 && j==4)  || (i==5 && j==3) || (i==5 && j==2) || (i==4 && j==1))
					{
					System.out.print("*");	
					}
					else
						System.out.print(" ");
				}
				System.out.println();
		}
	}}

}
