package Programming;
import java.util.*;
public class mynameis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String x[]=a.split(" ");// to split words
		int j;
		
		for(int i=0;i<x.length;i++)// to track words
		{
		if(i%2!=0 )// condition to check odd number
		{
			int c=x[i].length();
		for(j=c-1;j>=0;j--)// to track letters of words
		{

		System.out.print(x[i].charAt(j));// reversing letters of words
				
		}
		System.out.print(" ");
		}
		else
			System.out.print(x[i]+" ");
		}
	}

}
