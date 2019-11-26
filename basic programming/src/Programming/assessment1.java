package Programming;
import java.util.*;
public class assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in); 
		String a=s.nextLine();
		int i,j;
		int freq[]=new int[a.length()];
		char c[]=a.toCharArray();
		Arrays.sort(c);
		for(i=0;i<a.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<a.length();j++)
			{
				if(c[i]==c[j])
				{
					freq[i]++;
					c[j]='0';
				}
			}
		}
		for(i=0;i<a.length();i++)
		{
			if(c[i]!=' ' && c[i]!='0')
			{
				System.out.println(c[i]+" "+freq[i]);
			}
		}
		
	}

}
