import java.util.Scanner;

public class SungjukStaticMethod {
	String hac, name, grade;
	int kor, eng, mat, tot;
	double avg;

	static int cnt = 0; // ī��Ʈ
	static double total_avg = 0; //

	SungjukStaticMethod() {
	}// ����Ʈ ������ ����� �Է�

	boolean input_sungjuk() { // �Է��۾�
		Scanner scan = new Scanner(System.in);
		System.out.print("�й��� �Է� �ϼ��� => ");
		hac = scan.next();
		if (hac.equals("exit"))
			return true;
		System.out.print("�̸��� �Է� �ϼ��� => ");
		name = scan.next();
		System.out.print("���������� �Է� �ϼ��� => ");
		kor = scan.nextInt();
		System.out.print("���������� �Է� �ϼ��� => ");
		eng = scan.nextInt();
		System.out.print("���������� �Է� �ϼ��� => ");
		mat = scan.nextInt();
		return false;
	}

	void process() { // �й� ���
		tot = 0;
		avg = 0.0;
		tot = kor + eng + mat;
		avg = tot / 3.;
		switch ((int) (this.avg / 10)) {
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
		System.out.printf("%2s  %3s  %3d  %3d  %3d  %3d  %5.2f %s\n", hac, name, kor, eng, mat, tot, avg, grade);
	}

	static double getTotalAvg() { // �����޼ҵ� ����
		return total_avg ;
	}// ��ü���

}