package Evision;

import java.time.LocalTime;

public class LocalTimee {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalTime custom = LocalTime.of(2, 35, 6, 555);
		System.out.println(custom);

		String time = "19:30:36";
		// parse time
		LocalTime parsedTime = LocalTime.parse(time);
		System.out.println(parsedTime);   

		LocalTime tt = t.minusHours(1);  // hours  - 1 =>  13 - 1 = 12
		System.out.println(tt);
	}
}
