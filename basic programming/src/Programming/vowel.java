package Programming;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
	
	int i=0;
	char c;
	String [] A=new String[a];
	for(i=0;i<a;i++)
	{
		System.out.println("Enter the Values");
		A[i]=s.next();
	}
	for(i=0;i<=a;i++)
	{
		c=A[i].charAt(0);
		
	   if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U')	)
			{
		System.out.println(A[i]);
			}
	}

}
