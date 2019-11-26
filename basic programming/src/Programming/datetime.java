package Programming;

import java.time.*;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Today Date");
		LocalDate date=LocalDate.now();//create date object
		System.out.println(date);//display current date
		
		System.out.println("Current Time");
		LocalTime time=LocalTime.now();//create time object
		System.out.println(time);//display current time
		
		System.out.println("Current Date and Time");
		LocalDateTime dt=LocalDateTime.now();//create date and time object
		System.out.println(dt);//display current date and time 
	}

}
