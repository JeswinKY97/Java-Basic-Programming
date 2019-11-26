package Programming;

import java.util.Scanner;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		StringBuffer sb = new StringBuffer("hello");
		System.out.println("Enter  your name");
		sb.append("Name: "+s.nextLine()+"\n");
		System.out.println("Enter  your address");
		sb.append("Address: "+s.nextLine()+"\n");
		System.out.println("Enter  your contact number");
		sb.append("Number: "+s.nextLine()+"\n");
		System.out.println("Enter  your Email ID");
		sb.append("Email Id: "+s.nextLine()+"\n");
		System.out.println("Enter  your proof type");
		sb.append("Proof type: "+s.nextLine()+"\n");
		System.out.println("Enter  your proof id");
		sb.append("Proof Id: "+s.nextLine()+"\n");
		System.out.println(sb);
		

	}

}
