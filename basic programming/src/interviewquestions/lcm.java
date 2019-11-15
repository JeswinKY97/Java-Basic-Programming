package interviewquestions;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=s.nextInt();
		System.out.println("Enter the 2nd number");
		int b=s.nextInt();
		int max=(a>b)?a:b;
		int i;
		int lcm;
		for(i=max;;i++)
		{
			if((i%a==0)&&(i%b==0))
			{
				lcm=i;
				System.out.print("lcm is  "+lcm);
		        break;
			}
	}
	}

}
