package Switch;
import java.util.Scanner;

public class sumofevenandoddfibbanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int d=0;
		int	e=0;
		
		for(int i=2;i<n;i++)
		{
			 
			int c=a+b;
			if(c%2==1)
			{
				d=d+c;	
			}
			else
			{
				e=e+c;
			}
			a=b;
			b=c;
		}
		System.out.println(d);
		System.out.println(e);
	}

}
