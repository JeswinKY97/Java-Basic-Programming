package operator;
import java.util.Scanner;
public class Bodmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b = s.nextInt();

		System.out.println("Sum = " +(a+b));
		System.out.println("Difference = " +(a-b));
		System.out.println("Product = " +(a*b));
		System.out.println("Division = " +(a/b));
		System.out.println("Modulus = " +(a%b));
		

	}

}
