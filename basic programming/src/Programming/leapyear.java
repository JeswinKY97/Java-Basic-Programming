package Programming;

import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter year");
		int y=s.nextInt();
		
			if((y%4==0))
			{
			if((y%100==0))
			{
				if((y%400==0))
				
				{
					System.out.println("Leap Year");
				}
			else
				
			System.out.println("Not Leap Year");

				
			}
			
			else
			{
		System.out.println("Leap Year");
			}
			}
			else
			{
		System.out.println("Not Leap Year");
			}
			s.close();
	}

}
