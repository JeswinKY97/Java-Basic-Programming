package operator;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b = s.nextInt();
		int c=a;
		a=b;b=c;
		

		System.out.println("A= "+a);
		System.out.println("B = " +b );
	}

}
