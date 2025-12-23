package in06.dataandtimeapi;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Example03 {
	
	public static void main(String[] args) throws ParseException {
		
		
		
		
		
	LocalDate date = LocalDate.now();
		
	LocalDate plusDays = date.plusDays(10);
	LocalDate plusMonths = date.plusMonths(6);
	LocalDate plusYears = date.plusYears(2);
	LocalDate plusWeeks = date.plusWeeks(1);
	
	System.out.println(plusDays);
	System.out.println(plusMonths);
	System.out.println(plusYears);
	System.out.println(plusWeeks);
	
	
    LocalTime now = LocalTime.now();
    System.out.println(now.plusHours(3));
    System.out.println(now.plusMinutes(3));
    System.out.println(now.plusSeconds(3));
    System.out.println(now.plusNanos(3));
    
    LocalDateTime now2 = LocalDateTime.now();
    
    LocalDate of = LocalDate.of(2024, 12, 20);
    System.out.println(of);
    
    
    
    
		
		
		
		
		
		
	}

}
