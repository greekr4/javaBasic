package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat asd1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat asd2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//yyyy - 년	//MM - 월	//dd - 일	//hh - 시	//mm - 분		//ss - 초
		String date1 = asd1.format(now);
		String date2 = asd2.format(now);
		
		System.out.println(date1);
		System.out.println(date2);
		
		int year = now.getYear();

		

	}

}
