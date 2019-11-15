package interviewquestions;

import java.util.Scanner;

public class vowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
			
		   if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
		   {
			System.out.print("Vowel");
			}
		   else
		   {
			   System.out.print("Consonant");
			   }
		   }
	}


