package Programming;
import java.util.Scanner;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		  String a=s.nextLine();
		  String arr[]=a.split(" ");
		  int c=0;
		  char a;
		  for(int i=0;i<arr.length;i++)
		  {
			  String b=arr[i].charAt(i);
			  for(int j=0;j<b.length();j++)
			  {
				  c=b.charAt(j);
				  if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U')	)
				  {
					c++;
				  }
				  System.out.println(a+" - "+c);
			  }
		  }
						
	}

}
