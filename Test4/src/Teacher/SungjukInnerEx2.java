package Teacher;

import java.util.Scanner;

public class SungjukInnerEx2 {
	public static void main(String args[]) {
		SungjukInner sungjuk = new SungjukInner();
		Scanner scan = new Scanner(System.in);
		int menu;

		while (true) {
			printMenu();
			System.out.print("메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.println("The End...");
				break;
			}

			switch (menu) {
			case 1:
				inputSungjuk(sungjuk);
				break;
			case 2:
				printSungjuk(sungjuk);
				break;
			case 3:
				searchSungjuk(sungjuk);
				break;
			case 4:
				changeSungjuk(sungjuk);
				break;
			case 5:
				removeSungjuk(sungjuk);
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!!!\n");
			}

		}

	}

	static void inputSungjuk(SungjukInner sungjuk) {
		SungjukInner.Sungjuk obj = sungjuk.new Sungjuk();
		obj.input_sungjuk();
		if (sungjuk.checkSungjuk(obj)) {
			System.out.println("\n학번 입력 오류(중복)!!");
			return;
		}
		obj.process();
		sungjuk.addSungjuk(obj);;

	}

	static void printMenu() {
		System.out.println("*** 성적관리 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 성적정보 출력");
		System.out.println("3. 성적정보 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}

	static void printSungjuk(SungjukInner sungjuk) {
		if (sungjuk.getSungjukNum() == 0) {
			System.out.println("출력할 성적정보가 없습니다!!\n");
			return;
		}
		System.out.println("             *** 성적표 ***");
		System.out.println("=======================================");
		System.out.println("학번    이름    국어    영어    수학    총점    평균   등급");
		System.out.println("=======================================");
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			dat.output_Sungjuk();
		}
		System.out.println("=======================================");
		System.out.printf("\t 총학생수 : %d, 전체 평균 : %5.2f\n\n", sungjuk.getSungjukNum(),
				sungjuk.getTotalAvg() / sungjuk.getSungjukNum());

	}

	static void searchSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 학번 입력=> ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {
				System.out.println("\n학번    이름    국어    영어    수학    총점    평균   등급");
				System.out.println("=======================================");
				dat.output_Sungjuk();
				System.out.println("=======================================\n");
				return;
			}

		}
		System.out.println("\n 조회할 학번 입력오류!!\n");
	}

	static void removeSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		int num = sungjuk.getSungjukNum();
		System.out.print("삭제할 학번 입력 => ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {
				sungjuk.removeSungjuk(dat);
				System.out.println("\n삭제완료!!\n");
				return;
			}

		}
		System.out.println("\n 삭제할 학번 입력오류!!\n");
	}

	static void changeSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		int num = sungjuk.getSungjukNum();
		System.out.print("변경할 학번 입력 => ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {

				System.out.print("국어점수를 입력 하세요 => ");
				dat.kor = scan.nextInt();
				System.out.print("영어점수를 입력 하세요 => ");
				dat.eng = scan.nextInt();
				System.out.print("수학점수를 입력 하세요 => ");
				dat.math = scan.nextInt();
				dat.process();
				System.out.println("\n변경완료!!\n");
				return;
			}

		}
		System.out.println("\n 변경할 학번 입력오류!!\n");
	}
}
