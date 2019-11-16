package interviewquestions;
import java.util.*;

public class sumofprimenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,c=0;
		for( i=2;i<=n;i++)
		{
			for(j=1;j<n;j++)
			{
			if(n%i!=0)
			{
				c=c+i;
				
			}
				
			}
		}System.out.print(c);
		
	}

}
