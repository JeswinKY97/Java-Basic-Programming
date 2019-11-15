package interviewquestions;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=s.nextDouble();
		double a=(Math.PI)*r*r;
		System.out.println("Area"+a);
	}

}
