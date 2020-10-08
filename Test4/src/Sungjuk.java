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

		boolean input_sungjuk() { // 입력작업

			Scanner scan = new Scanner(System.in);
			System.out.print("학번을 입력 하세요 => ");
			hakbun = scan.next();
			if (hakbun.equals("exit"))
				return true;
			System.out.print("이름을 입력 하세요 => ");
			name = scan.next();
			System.out.print("국어점수를 입력 하세요 => ");
			kor = scan.nextInt();
			System.out.print("영어점수를 입력 하세요 => ");
			eng = scan.nextInt();
			System.out.print("수학점수를 입력 하세요 => ");
			math = scan.nextInt();

			return false;

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
