package Teacher;

import java.util.Scanner;

public class Sungjuk {

	String hakbun, irum, grade;
	int kor, eng, math, tot;
	double avg;

	static int cnt = 0;

	static double total_avg = 0.;
	// �ʵ� ����

	Sungjuk() {

	}
	// ������ �߰�, Ű����� �Է¹ޱ⶧���� �Ķ��Ÿ�� �Է����ʿ����.

	boolean input_sungjuk() {

		Scanner scan = new Scanner(System.in);
		System.out.print("�й��� �Է� �ϼ��� => ");
		this.hakbun = scan.next();
		System.out.print("�̸��� �Է� �ϼ��� => ");
		this.irum = scan.next();
		System.out.print("���������� �Է� �ϼ��� => ");
		this.kor = scan.nextInt();
		System.out.print("���������� �Է� �ϼ��� => ");
		this.eng = scan.nextInt();
		System.out.print("���������� �Է� �ϼ��� => ");
		this.math = scan.nextInt();
		return false;

	}

	void process_sungjuk() {
		tot = 0;
		avg = 0.0;
		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (this.avg / 10)) {
		case 10:
		case 9:
			this.grade = "��";
			break;
		case 8:
			this.grade = "��";
			break;
		case 7:
			this.grade = "��";
			break;
		case 6:
			this.grade = "��";
			break;
		default:
			this.grade = "��";
		}
	}

	void output_sungjuk() {

		System.out.printf("%2s  %3s   %3d  %3d   %3d   %3d  %5.2f %2s\n", hakbun, irum, kor, eng, math, tot, avg,
				grade);
	}

	static double getTotalAvg() {
		return total_avg / cnt;

	}
}