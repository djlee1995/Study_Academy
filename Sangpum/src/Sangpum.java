
import java.util.Scanner;

public class Sangpum {
	String code, irum, grade;
	int count, price, sum;
	static int cnt = 0;
	static int total_price = 0; // �ݾ� ����(���Ǹűݾ�

	Sangpum() {

	}

	boolean input_sangpum() { // ������ �Է¹޴�
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǰ�ڵ� �Է� => ");
		code = scan.next();
		if (code.equals("exit"))
			return true; // �����ϴ°��� ���� ������ ���� �����ϱ� ������
		System.out.print("��ǰ�� �Է� => ");
		irum = scan.next();
		System.out.print("���� �Է� => ");
		count = scan.nextInt();
		System.out.print("�ܰ� �Է� => ");
		price = scan.nextInt();
		return false;
		// return; ��������

		// void�޼ҵ�� �ۼ��ص��ȴ�
	}

	void process_sangpum() { // �ݾ� ��ޱ��ϴ� ��
		sum = count * price;

		if (count >= 30)
			grade = "���";
		else if (count >= 10)
			grade = "����";
		else
			grade = "�й�";
	}

	void output_sangpum() { // �ʵ峻������ �ۼ�
		System.out.printf("%4s  %4s  %4d  %6d %8d %2s\n", code, irum, count, price, sum, grade);
		// �������� �����͸� �Է� ��½� == **�� �̷��� �ȳִ´�
	}

	static int getTotalPrice() { // �����޼ҵ峻������ �����ʵ常 ��밡��
		return total_price;
	}
}