package interviewquestions;

import java.util.Scanner;

public class deletevowels {

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
			
		   if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
		   {
			System.out.print("");
			}
		   else
		   {
			   System.out.print(c);
			   }
		   }
	}

}
