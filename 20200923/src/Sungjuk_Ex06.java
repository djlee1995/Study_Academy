
import java.util.*;

public class Sungjuk_Ex06 {

	final static int MAX = 100;

	public static void main(String[] args) {
		// SungjukStaticMethod obj[] = new SungjukStaticMethod[MAX];
		HashMap<String, SungjukStaticMethod> hash = new HashMap<String, SungjukStaticMethod>();
		int menu;

		Scanner scan = new Scanner(System.in);

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
				input_sungjuk(hash);
				break;
			case 2:
				output_sungjuk(hash);
				break;
			case 3:
				search_sungjuk(hash);
				break;
			case 4:
				update_sungjuk(hash);
				break;
			case 5:
				delete_sungjuk(hash);
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!!!\n");
			}
		}
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

	static void input_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		SungjukStaticMethod obj = new SungjukStaticMethod();
		obj.input_sungjuk();

		if (hash.get(obj.hac) != null) {
			System.out.println("\n학번 입력 오류(중복)!!\n");

		
		} else {
			hash.put(obj.hac, obj);
			obj.process();
			System.out.println("\n성적정보 입력 성공!!\n");
		}

		
	}

	static void output_sungjuk(HashMap<String, SungjukStaticMethod> hash) {

		if (hash.size() == 0) {
			System.out.println("출력할 성적정보가 없습니다!!\n");
			return;
		}

		System.out.println("             *** 성적표 ***");
		System.out.println("=======================================");
		System.out.println("학번    이름    국어    영어    수학    총점    평균   등급");
		System.out.println("=======================================");
		SungjukStaticMethod.total_avg = 0;
		for (SungjukStaticMethod dat : hash.values()) {
			dat.output_Sungjuk();
			SungjukStaticMethod.total_avg += dat.avg;
		}
		System.out.println("=======================================");
		System.out.printf("\t 총학생수 : %d, 전체 평균 : %5.2f\n\n", hash.size(),
				SungjukStaticMethod.getTotalAvg() / hash.size());
	}

	static void search_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("조회할 학번 입력 => ");
		String hakbun = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (hakbun.equals(dat.hac)) {
				System.out.println("\n학번    이름    국어    영어    수학    총점    평균   등급");
				System.out.println("=======================================");
				dat.output_Sungjuk();
				;
				System.out.println("=======================================\n");
				return;
			}
		}
		System.out.println("\n조회할 학번 입력 오류!!\n");
	}

	static void update_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("수정할 학번 입력 => ");
		String hakbun = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (dat.hac.equals(hakbun)) {
				System.out.print("국어 입력 => ");
				dat.kor = scan.nextInt();
				System.out.print("영어 입력 => ");
				dat.eng = scan.nextInt();
				System.out.print("수학 입력 => ");
				dat.mat = scan.nextInt();
				dat.process();
				System.out.println("\n성적정보 수정 성공!!\n");
				return;
			}
		}
		System.out.println("\n수정할 학번 입력 오류!!\n");
	}

	static void delete_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 학번 입력 => ");
		String hac = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (dat.hac.equals(hac)) {
				hash.remove(hac);
				System.out.println("\n성적정보 삭제 성공!!\n");
				return;
			}
		}
		System.out.println("\n삭제할 학번 입력 오류!!\n");
	}
}
