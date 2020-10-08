import java.util.ArrayList;
import java.util.Scanner;

class Sungjuk {
	ArrayList<Info> list = new ArrayList<Info>();

	Sungjuk() {

	}

	void addSungjuk() {
		Info obj = new Info();
		obj.input_sungjuk();
		obj.process();
		
		list.add(obj);
	}

	int getSungjukNum() {
		return list.size();
	}
	

	Info getSungjuk(int index) {
		return list.get(index);
	}

	double getTotalAvg() {
		double tot_avg = 0;
		for (Info obj : list)
			tot_avg += obj.avg;
		return tot_avg;
	}
	void removeSungjuk(int index) {
		list.remove(index);
	}
	void changeSungjuk(int index,String hakbun,int kor,int eng,int math) {
		Info info = list.get(index);
		info.hakbun=hakbun;
		info.kor=kor;
		info.eng=eng;
		info.math=math;
	}

	class Info {
		String hakbun, name, grade;
		int kor, eng, math, tot;
		double avg;

		Info() {

		}

		boolean input_sungjuk() { // �Է��۾�

			Scanner scan = new Scanner(System.in);
			System.out.print("�й��� �Է� �ϼ��� => ");
			hakbun = scan.next();
			if (hakbun.equals("exit"))
				return true;
			System.out.print("�̸��� �Է� �ϼ��� => ");
			name = scan.next();
			System.out.print("���������� �Է� �ϼ��� => ");
			kor = scan.nextInt();
			System.out.print("���������� �Է� �ϼ��� => ");
			eng = scan.nextInt();
			System.out.print("���������� �Է� �ϼ��� => ");
			math = scan.nextInt();

			return false;

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
