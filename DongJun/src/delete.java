
public class delete extends update  {

	void delete() {
		System.out.println("======================================================");
		System.out.println("              ###���� ����###");
		System.out.println("������ ������ ������ȣ�� �Է��ϼ��� .");
		int bookNum = sc.nextInt();
		// �ٸ� ��ȣ�� ������ �� ���޼���
		Book b = find(bookNum);
		if (b == null) {
			System.out.println("�Է��Ͻ� ������ȣ�� ������ �������� �ʽ��ϴ�.");
			return;
		}

		// ����
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] != null) {
				if (obj[i].getNum() == bookNum) {
					obj[i] = null;
					System.out.println("�Է��Ͻ� ������ �����Ǿ����ϴ�!!");

					return;

				}

			}

		}
		System.out.println("======================================================");

	}

}
