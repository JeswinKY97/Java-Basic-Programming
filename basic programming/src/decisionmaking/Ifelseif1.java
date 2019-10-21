
package decisionmaking;
import java.util.Scanner;
public class Ifelseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your bus number");
		int a=s.nextInt();
		if(a<=2)
		{
			System.out.print("sunday only");
			}
		else if(a<7 && a>= 2)
		{System.out.print("daily");}
		else if(a>=7&& a<=15)
		
		{System.out.print("mondays and fridays");}
		else {System.out.print("please give valid bus number");}
	

	}

}
