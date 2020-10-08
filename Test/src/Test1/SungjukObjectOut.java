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
			System.out.println("������� ��!");
		} catch (IOException ioe) {
			// TODO: handle exception
			System.err.println("������ ����� �� �����ϴ�.");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}