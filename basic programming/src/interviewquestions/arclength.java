package interviewquestions;
import java.util.*;
public class arclength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt(); 
		System.out.println("Enter the angle");
		int a=s.nextInt();
		double pi=3.14;
		
		
			double m=(a*2*pi*r)/360;
			System.out.println(m);
		
		
			
	}

}
