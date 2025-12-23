package in06.dataandtimeapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example01 {
	
	public static void main(String[] args) throws ParseException {
		
		Date d=new Date();
		System.out.println(d);
		
		
		
		//convert for data to string[format()]
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		
		String format = sdf1.format(d);
		System.out.println(format);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");
		String format2 = sdf2.format(d);
		System.out.println(format2);
		
		
		//Convert from string to date[parse]
		SimpleDateFormat sdf4=new SimpleDateFormat("dd-MM-yyyy");
		Date parse = sdf4.parse("09-12-2025");
		System.out.println(parse);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20");
		System.out.println(parsedDate);
		
		
		
		
		
		
	}

}
