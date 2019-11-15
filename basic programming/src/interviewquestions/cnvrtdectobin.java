package interviewquestions;
import java.util.*;
public class cnvrtdectobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		 
		int a;
	        String x = " "; 
	        System.out.print("Enter any decimal number:");
	        int n = s.nextInt();
	        while(n > 0)
	        {
	            a=n%2;
	           x=a+x;
	           n=n/2;
	        }
	        System.out.println("Binary number:"+x);
	        
	}

}
