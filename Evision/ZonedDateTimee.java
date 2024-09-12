package Evision;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimee {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		ZoneId.getAvailableZoneIds();
	}

}
