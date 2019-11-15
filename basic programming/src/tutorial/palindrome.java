package tutorial;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int r,sum=0,num=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");	
		}
		
		
	}

}
