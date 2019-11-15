package interviewquestions;
import java.util.*;

public class powerofgivenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base");
		int b=s.nextInt();
		System.out.println("Enter the exponent");
		int e=s.nextInt();
		int p=1;
		for(int i=1;i<=e;i++)
		{
			p=p*b;
		}
		System.out.println("Result: "+p);
	}

}
