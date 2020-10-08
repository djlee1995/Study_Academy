import java.util.*;
import java.text.*; // SimpleDateFormat 클래스가 속하는 패키지

class DateFormatExample1 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
	}
}