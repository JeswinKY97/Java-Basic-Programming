package tutorial;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i,count=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");
	}

}
