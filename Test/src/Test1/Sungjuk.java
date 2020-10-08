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
		System.out.print("학번 입력 => ");
		hakbun = in.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		System.out.print("이름을 입력=> ");
		irum = in.next();
		System.out.print("국어점수를 입력=> ");
		kor = in.nextInt();
		System.out.print("영어점수를 입력=> ");
		eng = in.nextInt();
		System.out.print("수학점수를 입력=> ");
		math = in.nextInt();
		return false;
	}

	public void process() {

		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;

		}

	}

	public void output() {
		System.out.printf("%4s %3s %3d %3d %3d %3d %5.2f %s\n", hakbun, irum, kor, eng, math, tot, avg, grade);

	}

	public String toString() {
		String str = "학번: " + hakbun + "이름: " + irum + "등급: " + grade + "국어: " + kor + "영어: " + eng + "수학: " + math
				+ "총점: " + tot + "평균: " + avg;
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