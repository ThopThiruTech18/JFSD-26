package in06.dataandtimeapi;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Example02 {
	
	public static void main(String[] args) throws ParseException {
		
		
		Date d=new Date();
		System.out.println(d);
		
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);
		
		
		
		
		
		
	}

}
