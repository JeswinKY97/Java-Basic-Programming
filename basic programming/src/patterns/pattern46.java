package patterns;

import java.util.Scanner;

public class pattern46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		  int n = s.nextInt();

	        for (int i = 1; i <= n; i++)
	        {
	        	for(int k=n;k>i;k--)
	        	{
	        		System.out.print(" ");
	        	}
	        	System.out.print(" ");
	            for (int j = i; j >= 1; j--)
	            {
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }	  
	}

}
