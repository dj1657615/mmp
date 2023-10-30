package common;

import java.util.regex.Pattern;

public class Tool {

	public static boolean checkApiErrorText(String text) {
		Pattern.compile("['\"]").matcher(text).find();

		System.out.println("//////////////////////////////////////");
		System.out.println(text.matches("(.*)['\"](.*)"));
		System.out.println(Pattern.compile("['\"]").matcher(text).find());
		System.out.println("//////////////////////////////////////");
		return text.matches("(.*)['\"](.*)");
	}

	public static boolean isDate(String date) {
		return isDateString(date) || isDateLength(date) || isDateNumCount(date) || isDateFormat(date)
				|| isYearFormat(date) || isMonthForamt(date) || isDayForamt(date) || isExceptionDate(date);
	}

	private static boolean isExceptionDate(String date) {
		String[] dates = date.split("-");
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]);
		int day = Integer.parseInt(dates[2]);

		return (year % 4 == 0 && month == 2 && day > 29) || (year % 4 != 0 && month == 2 && day > 28)
				|| (month == 4 && day > 30) || (month == 6 && day > 30) || (month == 9 && day > 30)
				|| (month == 11 && day > 30);
	}

	private static boolean isDayForamt(String date) {
		int day = Integer.parseInt(date.split("-")[2]);
		return day < 1 || day > 31;
	}

	private static boolean isMonthForamt(String date) {
		int month = Integer.parseInt(date.split("-")[1]);
		return month < 1 || month > 12;
	}

	private static boolean isYearFormat(String date) {
		int year = Integer.parseInt(date.split("-")[0]);
		return year < 1990 || year > 3000;
	}

	private static boolean isDateFormat(String date) {
		return date.charAt(4) != '-' || date.charAt(7) != '-';
	}

	private static boolean isDateString(String date) {
		return !(date.charAt(0) >= '1' && date.charAt(0) <= '2');
	}

	private static boolean isDateNumCount(String date) {
		int numCount = 0;
		for (int i = 0; i < date.length(); i++) {
			if (date.charAt(i) >= '0' && date.charAt(i) <= '9') {
				numCount++;
			}
		}
		return numCount != 8;
	}

	private static boolean isDateLength(String date) {
		return date.length() != 10;
	}
	
	

}
