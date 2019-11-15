package interviewquestions;
import java.util.*;
public class leapyeear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int y=s.nextInt();	
		if(((y%4==0) && (y%100!=0))||(y%400==0))
			System.out.print("Leap Year");
		else
			System.out.print("Not a Leap Year");
	}

}
