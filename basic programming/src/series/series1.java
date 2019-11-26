package series;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,a;
		
		for(i=1;i<=n;i++)
		{
		if(i%2==1)
		{
			a=(i*i)-1;
			System.out.print(a+",");
		}
		else
		{
			a=(i*i)-2;
		System.out.print(a+",");
		}
			
		}
	}

}
