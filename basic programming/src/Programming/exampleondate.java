package Programming;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class exampleondate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the Address");
		String address=s.next();
		System.out.println("Number of Rooms");
		int room=s.nextInt();
		System.out.println("Number of persons");
		int persons=s.nextInt();
		
		if(persons>(room*2)+1)
		{
			System.out.println("It is not possible, you have to take more Rooms");
		}
		else
		{
		System.out.println("AC/Non-AC");
		String ac=s.next();
		System.out.println("Enter the Booking Date");
		String date=s.next();
		System.out.println("Checkout Date");
		String cdate=s.next();
		int a;
		
		System.out.println("Registration details");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("No. of Rooms : "+room);
		System.out.println("No. of Persons  : "+persons);
		
		if(ac.equals("ac"))
		{
			a=100;
			System.out.println("AC : yes");
		}
			else
			{
				a=0;
			System.out.println("AC : no");
			}
		
		 LocalDate ds = LocalDate.parse(date);
		    LocalDate de = LocalDate.parse(cdate);
		    long total = ChronoUnit.DAYS.between(ds,de);
		    System.out.println("No.of days: "+total);
		    if(persons==(room*2)+1)
		    {
		    int am=(int) (((500+a)*(persons*total))+250);
		    System.out.println("Amount : "+am);
		    }
		    else
		    {
		    	int am=(int) ((500+a)*persons*total);
			    System.out.println("Amount : "+am);	
		    }
		}
	}

}
 