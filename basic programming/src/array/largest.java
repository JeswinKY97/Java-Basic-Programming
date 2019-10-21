package array;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int m=0;
		int i=0;
		int [] A=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter the values");
			A[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(A[i]>=m)
			{
				m=A[i];
			}
			
			
		}
		System.out.println("Largest no"+m);
	}


	

}
