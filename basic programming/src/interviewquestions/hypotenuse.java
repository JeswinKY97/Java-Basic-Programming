package interviewquestions;
import java.util.*;

public class hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st side");
		double a=s.nextDouble();
		System.out.println("Enter the 2nd side");
		double b=s.nextDouble();
		double c=Math.sqrt((Math.pow(a,a))+(Math.pow(b,b)));
		System.out.println(c);
	}

}
