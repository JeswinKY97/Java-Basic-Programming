package patterns;

import java.util.Scanner;

public class pattern43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(k);
				k=j+k;
			}
			System.out.print("\n");
			}
	}

}
