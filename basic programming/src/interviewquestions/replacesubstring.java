package interviewquestions;
import java.util.*;
public class replacesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.nextLine();
		System.out.println("Enter the string to replace");
		String str2=s.nextLine();
		String str=str1.replace(str1, str2);
		System.out.print(str);
	}

}
