package Programming;

import java.util.Scanner;

public class juststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String a=new String("My name");
		String b=new String("is Jeswin");
		String c=new String("K Y");
		System.out.println(a.length());
		System.out.println(a.charAt(4));
		System.out.println(a.substring(2,5));
		boolean bo=b.startsWith("is");
		System.out.println(bo);
		System.out.println(b.indexOf("Jeswin"));
		System.out.println(a.concat(b));
		System.out.println(b.replace("i", "I"));
		
		String x[]=c.split(" ");
		for(int i=0;i<x.length;i++)
		{
		System.out.println(x[i]);
		}
		boolean b1=c.equals(a);
		System.out.println(b1);
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
	}
}