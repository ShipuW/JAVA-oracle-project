package Test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date myDate = new Date(System.currentTimeMillis());
		System.out.println(myDate.toString());
		SimpleDateFormat sDateFormate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sDateFormate.format(myDate));
	}

}
