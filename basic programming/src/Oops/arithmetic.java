package Oops;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=s.nextInt();
		System.out.println("Enter number2");
		int b=s.nextInt();
		System.out.println("1) add\n2) sub\n3) mul\n4) div\n5) mod");
		int n=s.nextInt();
		oper c=new oper(a,b);
		switch(n)
		{
		case 1:
			oper.add(a,b);
		    break;
		case 2:
			oper.sub(a,b);
			break;
		case 3:
			oper.mul(a,b);
			break;
		case 4:
			oper.div(a,b);
			break;
		case 5:
			oper.mod(a,b);
			break;
			
			
				
			
		
		}
		

	}

}
class oper{
int a,b;
public oper(int a,int b) {
	a=a;
	b=b;
}
public static void add(int a,int b) {
	System.out.printf("Add-> %d", a+b);
}
public static void sub(int a,int b) {
	System.out.printf("Sub-> %d", a-b);
}
public static void mul(int a,int b) {
	System.out.printf("Mul-> %d", a*b);
}
public static void div(int a,int b) {
	System.out.printf("Div-> %d", a/b);
}
public static void mod(int a,int b) {
	System.out.printf("Mod-> %d", a%b);
}
}