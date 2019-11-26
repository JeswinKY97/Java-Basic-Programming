package Programming;

import java.util.Scanner;

public class assesmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int i,j,a,b=2,c=4;
		  System.out.print(b+" ");
		  for(i=1;i<=(n-1)/2;i++)
		  {
			  a=c*i;
			  b=b+a;
			  System.out.print(b+" ");
			  b=b+a;
			System.out.print(b+" ");
		  }	  
	}

}
