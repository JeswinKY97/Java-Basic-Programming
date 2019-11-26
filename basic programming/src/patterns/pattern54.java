package patterns;

import java.util.Scanner;

public class pattern54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
		    if( (i==((n-1)/2) ||i==((n-1)/2)+1 || j==((n-1)/2) ||j==((n-1)/2)+1) && (i!=(n-1) && i!=0))
					System.out.print("s");
		    else if(i==0 ||i==1)	
			System.out.print("c");
			
			else if(i==n-1 || i==n-2)
				System.out.print("k");
			}
			System.out.println();
		}
	}

}
