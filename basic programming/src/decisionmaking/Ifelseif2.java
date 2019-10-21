
package decisionmaking;
import java.util.Scanner;
public class Ifelseif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your rank");
		int a=s.nextInt();
		if(a<=20)
		{
			System.out.print("you awarded 50% scholarship");
			}
		else if(a<45 && a>= 21)
		{System.out.print("you awarded 25% scholarship");}
		else if(a>=45&& a<=100)
		
		{System.out.print("you awarded 10% scholarship");}
		else {System.out.print("not eligible for scholarship");}
	

	}

}
