package Programming;
import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=s.nextInt();
		System.out.println("Enter the 2nd number");
		int b=s.nextInt();
		int min=(a<b)?a:b;
		int i;
		int gcd;
		for(i=min;i>=1;i--)
		{
			if((a%i==0)&&(b%i==0))
			{
				gcd=i;
				System.out.print("gcd is  "+gcd);
		        break;
			}
	}
		s.close();}
}