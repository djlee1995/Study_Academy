
public class Run extends lend {

	public static void main(String[] args) {
		new Run();
	}

	public Run() {

		while (true) {
			System.out.println("======================================================");
			System.out.println(" 1.도서등록  2.도서수정   3.도서삭제   4.도서리스트  5.도서대출반납  6.종료");
			System.out.println("======================================================");
			System.out.println("원하시는 메뉴의 번호를 입력해주세요.");
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
				System.out.println("종료하겠습니다.");
				System.exit(0);

			default:
				System.out.println("다시 입력해주세요.");

			}
		}
	}

}
