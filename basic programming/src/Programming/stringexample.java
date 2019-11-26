package Programming;

import java.util.Scanner;

public class stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str=s.next();
		int l=str.length();
		int v=0,n=0,sp=0;
		for(int i=0;i<l;i++)
		{
		char c=str.charAt(i);	
		
		if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U')	)
		{
			v++;
		}
		if(str.matches("^[0-9]*$"))
		{
			n++;
		}
//		if(str.matches(".*!@#$%&*()_+=|<>?{}\\\\[\\\\]~-*"))
//		{
//			sp++;
//		}
		}
		System.out.println("Charecters: "+l);
		System.out.println("Vowels: "+v);
		System.out.println("Charecters excluding vowels: "+(l-v));
		System.out.println("Numbers: "+n);
		System.out.println("Special charectors: "+sp);
	}

}
