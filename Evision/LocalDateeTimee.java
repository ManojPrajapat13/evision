package Evision;

import java.time.LocalDateTime;

public class LocalDateeTimee {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime parsed = LocalDateTime.parse("2023-05-03T02:55:36");
		System.out.println(parsed);
		
		System.out.println(parsed.getDayOfYear());

	}

}
