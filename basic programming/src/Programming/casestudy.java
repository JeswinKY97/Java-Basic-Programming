package Programming;

import java.util.Scanner;

public class casestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("1)Car\n2)Bike");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
	
		//car details
		StringBuffer car=new StringBuffer();
		System.out.println("Enter the color");
		car.append("Color: "+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		car.append("Maximum Speed: "+s.next()+"\n");
		System.out.println("Enter the number of seats");
		car.append("Seats: "+s.next()+"\n"); 
		System.out.println("Enter the number of wheels");
		car.append("Wheels: "+s.next()+"\n");
		System.out.println("Enter the number of doors");
		car.append("Doors: "+s.next()+"\n");
		System.out.println("Enter the status of AC");
		car.append("AC: "+s.next()+"\n");
		System.out.println("Car Details\n"+car);
		break;
		
		case 2:
		//bike details
		StringBuffer bike=new StringBuffer();
		System.out.println("Enter the color");
		bike.append("Color: "+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		bike.append("Maximum Speed: "+s.next()+"\n");
		System.out.println("Enter the number of seats");
		bike.append("Seats: "+s.next()+"\n"); 
		System.out.println("Enter the number of wheels");
		bike.append("Wheels: "+s.next()+"\n");
		System.out.println("Enter the status of Disk break");
		bike.append("Disk break: "+s.next()+"\n");
		System.out.println("Bike Details"+bike);
		break;
		}
	}

}
