import java.util.*;

public class Run {
		Book[] book = new Book[100];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("      ###�����������α׷�###   ");
			System.out.println("=============================");
			System.out.println("1.�����߰�  2.�������   ��������   .����    .�ݳ�  ���� ");
			String user = sc.next();
			System.out.println("=============================");

			switch (user) {
			case "1":
				add();
				break;
			case "2":
				list();
				break;
			case "3":
				del();
				break;
			case "4":
				borrow();
				break;
			case "5":
				bannab();
				break;
			case "0":
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}

		}
	}
	public void  add() {
	    System.out.println("����� ������ ������ �Է����ּ��� .");
	    String irum = getData(" ");

	    for(int i = 0; i < book.length; i++) {
			if(book[i] == null) {
					book[i] = new Book;
					numberOfBooks++;
					break;
			}
		}
	}

	
}
