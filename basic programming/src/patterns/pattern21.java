package patterns;
import java.util.*;
public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",i+65);
			}
			System.out.print("\n");
			}
	}

}
