package interviewquestions;
import java.util.*;
public class primenumber {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,c=0;
		for( i=2;i<=n/2;i++)
		{
			if(n%i==0 && n%i+2==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println(" Not a Prime number");
		}
	}

}
