package series;

import java.util.Scanner;

public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,a=11,b=15;
		int d=b-a;
		for(i=1;i<=n;i++)
		{
			int res=(int)Math.pow(a, 2);
			System.out.print(res+",");
			a=a+d;
		}
	}

}
