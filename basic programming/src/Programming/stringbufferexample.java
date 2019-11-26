package Programming;

import java.util.Scanner;

public class stringbufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the name");
		s.append("Name: "+sc.next()+"\n");
		System.out.println("Enter the class");
		s.append("Class: "+sc.next()+"\n");
		System.out.println("Roll no.");
		s.append("Roll no.: "+sc.next()+"\n");
		System.out.println(s);
		
		
	}
}
