
public class list extends delete {
	// ���� ��� ���
	public void list() {
		System.out.println("======================================================");
		System.out.println("              ###��������Ʈ###");
		
		for (Book b : obj) {
			if (b != null) {

				System.out.println(
						"    [ ������ȣ: " + b.getNum() + ", " + "å �̸�: " + b.getName() + ", ����: " + b.getWriter() +", ���⿩��: "+b.getLend()+ " ]");

			}

		}
		System.out.println("======================================================");
	}

}
