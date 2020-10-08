package Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukInner {
	private ArrayList<Sungjuk> list = new ArrayList<Sungjuk>();//���������͸� ������ ��ü

	SungjukInner() {

	}

	/*void addSungjuk() {
		Sungjuk obj = new Sungjuk();
		obj.input_sungjuk();
		if (checkSungjuk(obj)) {
			System.out.println("\n�й� �Է� ����(�ߺ�)!!");
			return;
		}
		obj.process();
		list.add(obj);
		System.out.println("\n�������� �Է� ����!!\n");
	}*/
	void addSungjuk(Sungjuk obj) {
		list.add(obj);
		System.out.println("\n�������� �Է� ����!!\n");
	}

	public ArrayList<Sungjuk> getList() {
		return list;
	}

	void removeSungjuk(Sungjuk obj) {
		list.remove(obj);
	}

	int getSungjukNum() {
		return list.size();
	}

	Sungjuk getSungjuk(int index) {
		return list.get(index);
	}

	double getTotalAvg() {
		double tot_avg = 0;
		for (Sungjuk obj : list)
			tot_avg += obj.avg;
		return tot_avg;
	}

	boolean checkSungjuk(Sungjuk obj) {
		for (Sungjuk dat : list) {
			if (dat.hakbun.equals(obj.hakbun)) {
				return true;
			}
		}
		return false;
	}

	class Sungjuk { //���� �����͸� �ٷ�� 
		String hakbun, name, grade;
		int kor, eng, math, tot;
		double avg;

		public Sungjuk() {

		}

		void input_sungjuk() { // �Է��۾�

			Scanner scan = new Scanner(System.in);
			System.out.print("�й��� �Է� �ϼ��� => ");
			hakbun = scan.next();
			System.out.print("�̸��� �Է� �ϼ��� => ");
			name = scan.next();
			System.out.print("���������� �Է� �ϼ��� => ");
			kor = scan.nextInt();
			System.out.print("���������� �Է� �ϼ��� => ");
			eng = scan.nextInt();
			System.out.print("���������� �Է� �ϼ��� => ");
			math = scan.nextInt();

		}

		void process() { // �й� ���
			tot = 0;
			avg = 0.0;
			tot = kor + eng + math;
			avg = tot / 3.;
			switch ((int) (avg / 10)) {
			case 10:
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
			}
		}

		void output_Sungjuk() {
			System.out.printf("%2s  %3s  %3d  %3d  %3d  %3d  %5.2f %s\n", hakbun, name, kor, eng, math, tot, avg,
					grade);
		}

	}
}
