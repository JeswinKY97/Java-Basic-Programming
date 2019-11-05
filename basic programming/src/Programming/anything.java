package Programming;
import java.util.*;

public class anything {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int l=0,i=0;
		String rev="";
		for(char c:st.toCharArray())
		{
			l++;
		}
		for(i=l-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		

	}

}
