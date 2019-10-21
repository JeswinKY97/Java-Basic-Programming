package operator;
import java.util.Scanner;
public class Midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float x1=s.nextFloat();
		float y1=s.nextFloat();
		float x2=s.nextFloat();
		float y2=s.nextFloat();
		float x=(x1+x2)/2;
		float y=(y1+y2)/2;
		System.out.printf("midpoint is %.02f  %.02f ", x,y);

	}

}
