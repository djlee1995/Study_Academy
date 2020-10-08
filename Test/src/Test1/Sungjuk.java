package Test1;

import java.io.Serializable;
import java.util.Scanner;

public class Sungjuk extends Person implements Personable, Serializable, Cloneable {

	public int kor, eng, math, tot;
	public double avg;
	public String grade;

	public Sungjuk() {
		// super();
	}

	public boolean input() {
		Scanner in = new Scanner(System.in);
		System.out.print("�й� �Է� => ");
		hakbun = in.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		System.out.print("�̸��� �Է�=> ");
		irum = in.next();
		System.out.print("���������� �Է�=> ");
		kor = in.nextInt();
		System.out.print("���������� �Է�=> ");
		eng = in.nextInt();
		System.out.print("���������� �Է�=> ");
		math = in.nextInt();
		return false;
	}

	public void process() {

		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 9:
			grade = "��";
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		case 6:
			grade = "��";
			break;
		default:
			grade = "��";
			break;

		}

	}

	public void output() {
		System.out.printf("%4s %3s %3d %3d %3d %3d %5.2f %s\n", hakbun, irum, kor, eng, math, tot, avg, grade);

	}

	public String toString() {
		String str = "�й�: " + hakbun + "�̸�: " + irum + "���: " + grade + "����: " + kor + "����: " + eng + "����: " + math
				+ "����: " + tot + "���: " + avg;
		return str;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Sungjuk))
			return false;
		Sungjuk sungjuk = (Sungjuk) obj;
		if (hakbun.equals(sungjuk.hakbun) && irum.equals(sungjuk.irum) && kor == sungjuk.kor && eng == sungjuk.eng
				&& math == sungjuk.math)
			return true;
		else
			return false;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}