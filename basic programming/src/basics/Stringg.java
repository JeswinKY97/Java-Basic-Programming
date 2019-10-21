package basics;
import java.util.Scanner;
public class Stringg {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		 Scanner s=new Scanner(System.in);
	      float a=s.nextFloat();
	        float b=s.nextFloat();
	        float c=s.nextFloat();
	        float d=s.nextFloat();
	        float e=s.nextFloat();
	      float f=(a+b+c+d+e)/5;
	      
	      
	      System.out.printf("%.2f",f);
	      s.close();
	}

}
