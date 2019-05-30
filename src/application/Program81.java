package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program81 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2019-05-29T20:41:00Z"));
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d = cal.getTime();
		int min = cal.get(Calendar.MINUTE);
		int mes = 1+ cal.get(Calendar.MONTH);
		
		System.out.println(min);
		System.out.println(mes);
		System.out.println(cal);
		System.out.println(sdf.format(d));
		
	}

}
