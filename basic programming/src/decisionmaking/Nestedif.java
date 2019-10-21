package decisionmaking;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("what you want");
		String b=s.nextLine();
		
		if(b.equals("computer")||b.equals( "COMPUTER"))
		{
			System.out.println("product available");
			System.out.println("how much number you want");
			int a=s.nextInt();
		 if(a<5)
		{
			 System.out.print("availble in this quantity");
			 }
		else
		
		{
			System.out.print("unavailable");
			}
		 }
		else 
		{
			System.out.print("out of stock");
		}
	

	}

}

