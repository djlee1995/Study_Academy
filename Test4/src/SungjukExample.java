import java.util.ArrayList;
import java.util.Scanner;

public class SungjukExample {
	public static void main(String args[]) {
		Sungjuk sungjuk = new Sungjuk();
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

	static void inputSungjuk(Sungjuk sungjuk) {
		sungjuk.addSungjuk();
		System.out.println();
		sungjuk.addSungjuk();
		System.out.println();
		sungjuk.addSungjuk();
		System.out.println();

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

	static void printSungjuk(Sungjuk sungjuk) {
		int num = sungjuk.getSungjukNum();
		System.out.println("             *** 성적표 ***");
		System.out.println("=======================================");
		System.out.println("학번    이름    국어    영어    수학    총점    평균   등급");
		System.out.println("=======================================");
		for (int cnt = 0; cnt < num; cnt++) {
			Sungjuk.Info obj = sungjuk.getSungjuk(cnt);
			obj.output_Sungjuk();
		}
		System.out.println("=======================================");
		System.out.printf("\t 총학생수 : %d, 전체 평균 : %5.2f\n\n", sungjuk.getSungjukNum(),
				sungjuk.getTotalAvg() / sungjuk.getSungjukNum());

	}

	static void searchSungjuk(Sungjuk sungjuk){
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 학번 입력=> ");
		String hakbun = scan.next();
		for ( : ) {
			if (hakbun.equals(dat.hac)) {
				System.out.println("\n학번    이름    국어    영어    수학    총점    평균   등급");
				System.out.println("=======================================");
				dat.output_Sungjuk();
				;
				System.out.println("=======================================\n");
				return;
			}
		
		}}

	static void removeSungjuk(Sungjuk sungjuk) {
		Scanner scan = new Scanner(System.in);
		int num = sungjuk.getSungjukNum();
		System.out.print("삭제할 학번 입력 => ");
		String hac = scan.next();
		for (int cnt = 0; cnt < num; cnt++) {
			if(hac.equals()) {
				sungjuk.removeSungjuk();
				}
			}
			
		}

	

	static void changeSungjuk(Sungjuk sungjuk) {

	}
}

