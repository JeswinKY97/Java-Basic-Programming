package Switch;

import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int collegeyear=s.nextInt();
		switch(collegeyear)
		{
		case 1:
			System.out.println("English,Mathematics,Physics");
			break;
		case 2:
			char b= s.next().charAt(0);
		switch(b)
		{
		case 'E':
			System.out.println("LCD,Network,Signals");
			break;
		case 'M':
			System.out.println("Fluidistics,Drawing,MM");
			break;
		}
		case 3:
			char b1= s.next().charAt(0);
			switch(b1)
			{
			case 'E':
				System.out.println("AET,PE,EM");
				break;
			case 'M':
				System.out.println("NF,HSS,UJT");
				break;
			}
		case 4:
			char b2= s.next().charAt(0);
			switch(b2)
			{
			case 'E':
				System.out.println("ES,DIP,QQ");
				break;
			case 'M':
				System.out.println("EN,MU,PH");
				break;
			}
			
		}
		}
	

}
