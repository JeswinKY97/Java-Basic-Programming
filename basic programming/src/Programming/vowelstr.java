package Programming;
import java.util.*;
public class vowelstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int i=0;
		char c;
		int cn=0;
		
		String  A=s.next();
		for(i=0;i<A.length();i++)
		{
		
			c=A.charAt(i);
			
		   if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='oS')||(c=='O')||(c=='u')||(c=='U')	)
				
		   {
			   cn++;
		for(int j=0;j<cn;j++)
		{
			System.out.print("*");
		}
			   System.out.print(c);
			   for(int k=0;k<cn;k++)
			   {
				   System.out.print("*");
			   }
		   }
		   else
		   {
			   System.out.print(c);
		}
		   }
		}
				
	}