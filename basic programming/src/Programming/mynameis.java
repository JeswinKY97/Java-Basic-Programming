package Programming;
import java.util.*;
public class mynameis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		for(int i=0;i<a.length()-1;i++)
		{
		if(a.charAt(i)==' ' )
		c++;
		
		}System.out.print(c+1);
	}

}
