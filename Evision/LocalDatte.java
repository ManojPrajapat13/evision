package Evision;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDatte {

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println(l);

		int dayOfMonth = l.getDayOfMonth();
		int dayOfYear = l.getDayOfYear();
		Month m = l.getMonth();
		int Month = l.getMonthValue();
		int year = l.getYear();

		System.out.println(dayOfMonth); // 9
		System.out.println(dayOfYear); // 253
		System.out.println(Month); // 9
		System.out.println(m);
		System.out.println(year); // 2024

		LocalDate myBirthDate = LocalDate.of(2002, 07, 13);
		System.out.println("myBirthDate - " + myBirthDate);

		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);

		LocalDate yesterday = today.minusDays(1);
		System.out.println("yesterday : " + yesterday);

		LocalDate pastDay = today.minusMonths(15);
		System.out.println("pastDay : " + pastDay);

		if (pastDay.isLeapYear()){
			System.out.println("true..");
		}else {
			System.out.println("false...");
		}
	}
}
