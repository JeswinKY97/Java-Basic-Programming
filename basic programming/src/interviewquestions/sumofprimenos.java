package interviewquestions;
import java.util.*;

public class sumofprimenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,c=0;
		for( i=2;i<=n;i++)
		{
			if(n%i==1)
			{
				c++;
				break;
				
			}
		}
		
	}

}
