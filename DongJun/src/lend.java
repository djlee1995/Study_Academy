
public class lend extends list {
	
	void lend() {
		boolean lend = true;
		while (lend) {
			System.out.println("======================================================");
			System.out.println("              ###���� ���� �ݳ�###");
			System.out.println("����(�ݳ�)�� ������ ������ȣ�� �Է��ϼ��� .(0���� ������ �ʱ�ȭ������!!)");
			int bookNum = sc.nextInt();
			if(bookNum==0) {
				System.out.println("�ʱ�ȭ������ ���ư��ڽ��ϴ�.");
				return;
			}

			Book b = find(bookNum);

			if (b == null) {
				System.out.println("�Է��Ͻ� ������ȣ�� ������ �������� �ʽ��ϴ�.");
				return;
			}

			System.out.println("======================================================");
			System.out.println(" 1.��������  2.�����ݳ�  3.�ʱ�ȭ��");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է����ּ���.");
			int user = sc.nextInt();
			System.out.println("======================================================");

			switch (user) {
			case 1:
				if (b.getLend() == "O") {
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					b.setLend("X");
				} else
					System.out.println("������ �Ұ����� �����Դϴ�!!");
				break;
			case 2:
				if (b.getLend() == "X") {
					System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
					b.setLend("O");
				} else
					System.out.println("�ݳ��� �Ұ����� �����Դϴ�!!");
				break;
			case 3:
				System.out.println("�ʱ�ȭ������ ���ư��ڽ��ϴ�.");
				lend = false;
				break;
			}

		}

	}

}
