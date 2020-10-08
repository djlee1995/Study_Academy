package Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukInner {
	private ArrayList<Sungjuk> list = new ArrayList<Sungjuk>();//성적데이터를 관리할 객체

	SungjukInner() {

	}

	/*void addSungjuk() {
		Sungjuk obj = new Sungjuk();
		obj.input_sungjuk();
		if (checkSungjuk(obj)) {
			System.out.println("\n학번 입력 오류(중복)!!");
			return;
		}
		obj.process();
		list.add(obj);
		System.out.println("\n성적정보 입력 성공!!\n");
	}*/
	void addSungjuk(Sungjuk obj) {
		list.add(obj);
		System.out.println("\n성적정보 입력 성공!!\n");
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

	class Sungjuk { //성적 데이터를 다루는 
		String hakbun, name, grade;
		int kor, eng, math, tot;
		double avg;

		public Sungjuk() {

		}

		void input_sungjuk() { // 입력작업

			Scanner scan = new Scanner(System.in);
			System.out.print("학번을 입력 하세요 => ");
			hakbun = scan.next();
			System.out.print("이름을 입력 하세요 => ");
			name = scan.next();
			System.out.print("국어점수를 입력 하세요 => ");
			kor = scan.nextInt();
			System.out.print("영어점수를 입력 하세요 => ");
			eng = scan.nextInt();
			System.out.print("수학점수를 입력 하세요 => ");
			math = scan.nextInt();

		}

		void process() { // 학번 등급
			tot = 0;
			avg = 0.0;
			tot = kor + eng + math;
			avg = tot / 3.;
			switch ((int) (avg / 10)) {
			case 10:
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
			}
		}

		void output_Sungjuk() {
			System.out.printf("%2s  %3s  %3d  %3d  %3d  %3d  %5.2f %s\n", hakbun, name, kor, eng, math, tot, avg,
					grade);
		}

	}
}
