import java.util.*;

class add {
	Scanner sc = new Scanner(System.in);
	Book[] obj = new Book[100];

	int count = 0;
	

	void add() {
		System.out.println("======================================================");
		System.out.println("              ###���� ���###");
		System.out.println("����� ������ ������ �Է����ּ��� .");
		String title = sc.next();
		System.out.println("����� ������ ���ڸ� �Է����ּ��� .");
		String author = sc.next();
		
		// �����߰�
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] == null) {
				count++;
				obj[i] = new Book(count, title, author);
				System.out.println("����� �Ϸ�Ǿ����ϴ�!!");
				System.out.println("======================================================");
				break;
			}
		}
	}

}
