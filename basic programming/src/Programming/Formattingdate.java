package Programming;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Formattingdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Before Formatting: "+dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("YYY-MM-DD HH : mm : ss");
		System.out.println("After Formatting: "+ format);
	}

}
