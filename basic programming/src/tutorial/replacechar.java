package tutorial;
import java.util.*;
public class replacechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int i=0;
		char c;
		int c1;
		
		String  A=s.next();
		for(i=0;i<A.length();i++)
		{
		
			c=A.charAt(i);
			c1=A.charAt(i+1);
		   if(c==c1)
				
		   {
			   

			System.out.print("**");
		
			   
		   }
		   else
		   {
			   System.out.print(c);
		}
		   }
		}
				
	}