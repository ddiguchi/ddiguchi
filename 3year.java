package HelloWorld;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
	    System.out.println("今日は"+today);
	    DayOfWeek  dow = today.getDayOfWeek();
	    System.out.println("曜日(英語)：" + dow);
		DayOfWeek  dow3 = today.plusYears(3).getDayOfWeek();
		System.out.println("3年後の今日は"+today.plusYears(3));
		System.out.println("3年後の曜日(英語)：" + dow3);
		System.out.println("***************");
	}
}
