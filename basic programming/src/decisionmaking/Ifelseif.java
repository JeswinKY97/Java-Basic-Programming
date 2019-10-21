
package decisionmaking;
import java.util.Scanner;
public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your mark");
		int a=s.nextInt();
		if(a>=85)
		{
			System.out.print("first class");
			}
		else if(a>45 && a<= 85)
		{System.out.print("second class");}
		else if(a>=30&& a<=45)
		
		{System.out.print("just pass");}
		else {System.out.print("failed");}
	

	}

}
