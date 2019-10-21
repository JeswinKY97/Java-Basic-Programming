package array;
import java.util.Scanner;

public class addarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int a=s.nextInt();
		int [] A=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the Values");
			A[i]=s.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int b=s.nextInt();
		int [] B=new int[a];
		for(int i=0;i<b;i++)
		{
			System.out.println("Enter the Values");
			B[i]=s.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			int c=A[i]+B[i];
			System.out.println("Sum");
			
		}
	}

}
