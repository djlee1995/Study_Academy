package Teacher;

import java.util.Scanner;

public class SungjukInnerEx2 {
	public static void main(String args[]) {
		SungjukInner sungjuk = new SungjukInner();
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

	static void inputSungjuk(SungjukInner sungjuk) {
		SungjukInner.Sungjuk obj = sungjuk.new Sungjuk();
		obj.input_sungjuk();
		if (sungjuk.checkSungjuk(obj)) {
			System.out.println("\n�й� �Է� ����(�ߺ�)!!");
			return;
		}
		obj.process();
		sungjuk.addSungjuk(obj);;

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

	static void printSungjuk(SungjukInner sungjuk) {
		if (sungjuk.getSungjukNum() == 0) {
			System.out.println("����� ���������� �����ϴ�!!\n");
			return;
		}
		System.out.println("             *** ����ǥ ***");
		System.out.println("=======================================");
		System.out.println("�й�    �̸�    ����    ����    ����    ����    ���   ���");
		System.out.println("=======================================");
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			dat.output_Sungjuk();
		}
		System.out.println("=======================================");
		System.out.printf("\t ���л��� : %d, ��ü ��� : %5.2f\n\n", sungjuk.getSungjukNum(),
				sungjuk.getTotalAvg() / sungjuk.getSungjukNum());

	}

	static void searchSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȸ�� �й� �Է�=> ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {
				System.out.println("\n�й�    �̸�    ����    ����    ����    ����    ���   ���");
				System.out.println("=======================================");
				dat.output_Sungjuk();
				System.out.println("=======================================\n");
				return;
			}

		}
		System.out.println("\n ��ȸ�� �й� �Է¿���!!\n");
	}

	static void removeSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		int num = sungjuk.getSungjukNum();
		System.out.print("������ �й� �Է� => ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {
				sungjuk.removeSungjuk(dat);
				System.out.println("\n�����Ϸ�!!\n");
				return;
			}

		}
		System.out.println("\n ������ �й� �Է¿���!!\n");
	}

	static void changeSungjuk(SungjukInner sungjuk) {
		Scanner scan = new Scanner(System.in);
		int num = sungjuk.getSungjukNum();
		System.out.print("������ �й� �Է� => ");
		String hak = scan.next();
		for (SungjukInner.Sungjuk dat : sungjuk.getList()) {
			if (hak.equals(dat.hakbun)) {

				System.out.print("���������� �Է� �ϼ��� => ");
				dat.kor = scan.nextInt();
				System.out.print("���������� �Է� �ϼ��� => ");
				dat.eng = scan.nextInt();
				System.out.print("���������� �Է� �ϼ��� => ");
				dat.math = scan.nextInt();
				dat.process();
				System.out.println("\n����Ϸ�!!\n");
				return;
			}

		}
		System.out.println("\n ������ �й� �Է¿���!!\n");
	}
}
