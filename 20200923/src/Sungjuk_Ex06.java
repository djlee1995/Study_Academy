
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
			System.out.print("�޴� ���� => ");
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
				System.out.println("�޴��� �ٽ� �����ϼ���!!!\n");
			}
		}
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

	static void input_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		SungjukStaticMethod obj = new SungjukStaticMethod();
		obj.input_sungjuk();

		if (hash.get(obj.hac) != null) {
			System.out.println("\n�й� �Է� ����(�ߺ�)!!\n");

		
		} else {
			hash.put(obj.hac, obj);
			obj.process();
			System.out.println("\n�������� �Է� ����!!\n");
		}

		
	}

	static void output_sungjuk(HashMap<String, SungjukStaticMethod> hash) {

		if (hash.size() == 0) {
			System.out.println("����� ���������� �����ϴ�!!\n");
			return;
		}

		System.out.println("             *** ����ǥ ***");
		System.out.println("=======================================");
		System.out.println("�й�    �̸�    ����    ����    ����    ����    ���   ���");
		System.out.println("=======================================");
		SungjukStaticMethod.total_avg = 0;
		for (SungjukStaticMethod dat : hash.values()) {
			dat.output_Sungjuk();
			SungjukStaticMethod.total_avg += dat.avg;
		}
		System.out.println("=======================================");
		System.out.printf("\t ���л��� : %d, ��ü ��� : %5.2f\n\n", hash.size(),
				SungjukStaticMethod.getTotalAvg() / hash.size());
	}

	static void search_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("��ȸ�� �й� �Է� => ");
		String hakbun = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (hakbun.equals(dat.hac)) {
				System.out.println("\n�й�    �̸�    ����    ����    ����    ����    ���   ���");
				System.out.println("=======================================");
				dat.output_Sungjuk();
				;
				System.out.println("=======================================\n");
				return;
			}
		}
		System.out.println("\n��ȸ�� �й� �Է� ����!!\n");
	}

	static void update_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �й� �Է� => ");
		String hakbun = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (dat.hac.equals(hakbun)) {
				System.out.print("���� �Է� => ");
				dat.kor = scan.nextInt();
				System.out.print("���� �Է� => ");
				dat.eng = scan.nextInt();
				System.out.print("���� �Է� => ");
				dat.mat = scan.nextInt();
				dat.process();
				System.out.println("\n�������� ���� ����!!\n");
				return;
			}
		}
		System.out.println("\n������ �й� �Է� ����!!\n");
	}

	static void delete_sungjuk(HashMap<String, SungjukStaticMethod> hash) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �й� �Է� => ");
		String hac = scan.next();

		for (SungjukStaticMethod dat : hash.values()) {
			if (dat.hac.equals(hac)) {
				hash.remove(hac);
				System.out.println("\n�������� ���� ����!!\n");
				return;
			}
		}
		System.out.println("\n������ �й� �Է� ����!!\n");
	}
}
