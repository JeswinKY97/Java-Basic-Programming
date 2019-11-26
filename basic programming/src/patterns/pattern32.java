package patterns;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		 int r = s.nextInt();
	        System.out.println("## Printing the pattern ##");
	        
	        for (int i=1; i<=r; i++) 
	        { 
	            // Print space in decreasing order 
	            for (int j=r; j>i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in increasing order5
	            for (int k=1; k<=(i * 2) -1; k++) 
	            { 
	               System.out.print("*"); 
	            } 
	            System.out.println(); 
	        } 
	        for (int i=r-1; i>=1; i--)
	        {
	         // Print space in increasing order
	            for (int j=r-1; j>=i; j--)
	            {
	                System.out.print(" ");
	            }
	            // Print star in decreasing order
	            for (int k=1; k<=(i * 2) -1; k++)
	            {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	}

}
