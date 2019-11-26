
package series;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,a=0;
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				a=(n/2)-1;
			}
			else 
			{
				a=n-1;
			}
		}
		System.out.println(a);
	}

}
