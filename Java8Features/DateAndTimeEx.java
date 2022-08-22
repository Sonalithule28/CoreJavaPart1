package com.Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateAndTimeEx {

	private static final LocalDate CurrentDate = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println("Date:" + d);

		LocalDate CurrentDate = LocalDate.now();
		System.out.println("CurrentDate is:" + CurrentDate);

		LocalTime CurrentTime = LocalTime.now();
		System.out.println("CurrentTime is:" + CurrentTime);

		LocalDateTime CurrentDateTime = LocalDateTime.now();
		System.out.println("CurrentDateTime is:" + CurrentDateTime);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone:" + currentZone);

		System.out.println("current year is leap :" + CurrentDate.isLeapYear());
		System.out.println("plus week is :" + CurrentDate.plusWeeks(1));
		System.out.println("plus months is :" + CurrentDate.plusMonths(8));

		System.out.println("minus days is :" + CurrentDate.minusDays(2));
		System.out.println("minus week is :" + CurrentDate.minusWeeks(2));
		System.out.println("minus month is :" + CurrentDate.minusMonths(2));

	}

}
