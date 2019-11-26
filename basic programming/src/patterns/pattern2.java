package patterns;

import java.util.*;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=number;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			}
	}

}
