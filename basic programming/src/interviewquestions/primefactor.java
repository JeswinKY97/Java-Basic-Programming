package interviewquestions;
import java.util.*;
public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
	int n=s.nextInt();
	for(int i=2;i<n;i++)
	{
		while(n%i==0)
		{
			System.out.print(i+" ");
			n=n/i;
		}
	}
	if(n>=2)
	{
		System.out.println(n);
	}
	}

}
                                                                                                                         