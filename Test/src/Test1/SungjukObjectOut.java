package Test1;

import java.io.*;
import java.util.GregorianCalendar;
import java.util.Calendar;


class SungjukObjectOut {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out= new ObjectOutputStream(new FileOutputStream("sungjuk.data"));
			Sungjuk obj = new Sungjuk();
			obj.input();
			obj.process();
			out.writeObject(obj);
			System.out.println("성적출력 끝!");
		} catch (IOException ioe) {
			// TODO: handle exception
			System.err.println("파일을 출력할 수 없습니다.");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}