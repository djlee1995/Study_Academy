
public class Run extends lend {

	public static void main(String[] args) {
		new Run();
	}

	public Run() {

		while (true) {
			System.out.println("======================================================");
			System.out.println(" 1.�������  2.��������   3.��������   4.��������Ʈ  5.��������ݳ�  6.����");
			System.out.println("======================================================");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է����ּ���.");
			int user = sc.nextInt();

			switch (user) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				list();
				break;
			case 5:
				lend();
				break;
			case 6:
				System.out.println("�����ϰڽ��ϴ�.");
				System.exit(0);

			default:
				System.out.println("�ٽ� �Է����ּ���.");

			}
		}
	}

}
