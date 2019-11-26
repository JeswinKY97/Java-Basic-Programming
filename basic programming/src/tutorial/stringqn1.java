package tutorial;

import java.util.Scanner;

public class stringqn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		String c=s.next();
		String str1=" ",str2=" ",str3,str4,str5;
		int i;
		char d;
		for(i=0;i<a.length();i++)
		{
		
			d = a.charAt(i);
			
		   if((d=='a')||(d=='A')||(d=='e')||(d=='E')||(d=='i')||(d=='I')||(d=='o')||(d=='O')||(d=='u')||(d=='U'))
		   {
			System.out.print("$");
			}
		   else
		   {
			   System.out.print(d);
			   }
		   str1=str1+d;
		}
		   for(i=0;i<b.length();i++)
			{
			   d = b.charAt(i);
			   if((d=='a')||(d=='A')||(d=='e')||(d=='E')||(d=='i')||(d=='I')||(d=='o')||(d=='O')||(d=='u')||(d=='U'))
			   {
				System.out.print(d);   
			   }
			   else
			   {
				   System.out.print("#");
			   }
			   str2=str2+d;
		   }
		   str3=c.toUpperCase();
		   str4=str1.concat(str2);
		   str5=str4.concat(str3);
		   System.out.println(str3);
		   //System.out.println(str4);
		  // System.out.println(str5);
	
	}

}
