import java.util.*;

class updateBook extends Book {
	Book book = new Book();
	Scanner sc = new Scanner(System.in);

	void updateBook() {
		while (true) {
			int cnt = 0;
			System.out.println("���� ��ȣ �Է����ּ���");
			String bunho = sc.next();
			if (bunho.equals(book.getNum())) {
				cnt++;
				System.out.println("���� ��ȣ �ߺ�!! �ٽ��Է����ּ���.");
				break;

			}
			if (cnt == 0) {
				book.setNum(bunho);
			}
		}
		System.out.println("å ���� �Է�");
		book.setIrum(sc.nextLine());
		book.setLend(true);

		System.out.println("������ȣ : " + book.getNum());
		System.out.println("�������� : " + book.getIrum());
		System.out.println("�뿩���� : " + book.getLend());

		System.out.println("������ �߰��ұ��? ��(y) �ƴϿ�(n)");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			// å�� �߰�
			System.out.println("======�Է� �Ϸ�=====");
			break;
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("�߰��Ͻ� ������ �ٽ��Է����ּ���.");
		} else {
			System.out.println("����!! �ʱ� ȭ������ �̵��ϰڽ��ϴ�.");
			break;
		}
	}

}
