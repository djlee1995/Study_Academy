import java.util.*;
import java.text.*;

class DateFormatExample2 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
	}
}
