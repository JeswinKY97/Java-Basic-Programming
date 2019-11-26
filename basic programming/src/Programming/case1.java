package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String c=sc.next();
		System.out.println("Enter the host");
		String st=sc.next();
		String s=c.concat(st);
		char m[]=s.toCharArray();
		Arrays.sort(m);
		System.out.println(m);
		System.out.println("Enter the name2");
		String c1=sc.next();
		char m1[]=c1.toCharArray();
		Arrays.sort(m1);
		//System.out.println(m1);
		String a=new String(m);
		String b=new String(m1);
		if(a.equals(b))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}

}
