
public class update extends add {

	void update() {
		System.out.println("======================================================");
		System.out.println("              ###��������###");
		System.out.println("�����Ͻ� ������ ������ȣ �Է����ּ���.");

		int bookNum = sc.nextInt();

		Book b = find(bookNum);

		if (b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� ������ �������� �ʽ��ϴ�.");
			return;
		}

		boolean update = true;

		while (update) {

			System.out.println("======================================================");
			System.out.println(" 1.�������  2.���ڼ���  3.�����Ϸ�");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է����ּ���.");
			int user = sc.nextInt();
			System.out.println("======================================================");

			switch (user) {

			case 1:
				System.out.println("������ ������ �������ּ���.");
				String name = sc.next();
				b.setName(name);
				System.out.println("���� ������...");
				break;
			case 2:
				System.out.println("������ ���ڸ� �������ּ���.");
				String writer = sc.next();
				b.setWriter(writer);
				System.out.println("���� �̸� ������...");
				break;
			case 3:
				System.out.println("�����Ͻ� ������ �����Ϸ�Ǿ����ϴ�.");
				update = false;
				break;
			}

		}

	}

	// �Է��� ������ȣ�� ������ �ִ��� Ȯ��
	public Book find(int num) {

		for (int i = 0; i < obj.length; i++) {
			if (obj[i] != null) {
				if (obj[i].getNum() == num) {
					return obj[i];
				}
			}
		}

		return null;
	}

}