import java.util.ArrayList;
import java.util.Scanner;

public class SungjukExample {
	public static void main(String args[]) {
		Sungjuk sungjuk = new Sungjuk();
		Scanner scan = new Scanner(System.in);
		int menu;

		while (true) {
			printMenu();
			System.out.print("�޴� ���� => ");
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
				System.out.println("�޴��� �ٽ� �����ϼ���!!!\n");
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
		System.out.println("*** �������� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}

	static void printSungjuk(Sungjuk sungjuk) {
		int num = sungjuk.getSungjukNum();
		System.out.println("             *** ����ǥ ***");
		System.out.println("=======================================");
		System.out.println("�й�    �̸�    ����    ����    ����    ����    ���   ���");
		System.out.println("=======================================");
		for (int cnt = 0; cnt < num; cnt++) {
			Sungjuk.Info obj = sungjuk.getSungjuk(cnt);
			obj.output_Sungjuk();
		}
		System.out.println("=======================================");
		System.out.printf("\t ���л��� : %d, ��ü ��� : %5.2f\n\n", sungjuk.getSungjukNum(),
				sungjuk.getTotalAvg() / sungjuk.getSungjukNum());

	}

	static void searchSungjuk(Sungjuk sungjuk){
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȸ�� �й� �Է�=> ");
		String hakbun = scan.next();
		for ( : ) {
			if (hakbun.equals(dat.hac)) {
				System.out.println("\n�й�    �̸�    ����    ����    ����    ����    ���   ���");
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
		System.out.print("������ �й� �Է� => ");
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

