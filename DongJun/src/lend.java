
public class lend extends list {
	
	void lend() {
		boolean lend = true;
		while (lend) {
			System.out.println("======================================================");
			System.out.println("              ###도서 대출 반납###");
			System.out.println("대출(반납)할 도서의 관리번호를 입력하세요 .(0번을 누르면 초기화면으로!!)");
			int bookNum = sc.nextInt();
			if(bookNum==0) {
				System.out.println("초기화면으로 돌아가겠습니다.");
				return;
			}

			Book b = find(bookNum);

			if (b == null) {
				System.out.println("입력하신 관리번호의 도서가 존재하지 않습니다.");
				return;
			}

			System.out.println("======================================================");
			System.out.println(" 1.도서대출  2.도서반납  3.초기화면");
			System.out.println("원하시는 메뉴의 번호를 입력해주세요.");
			int user = sc.nextInt();
			System.out.println("======================================================");

			switch (user) {
			case 1:
				if (b.getLend() == "O") {
					System.out.println("대출이 완료되었습니다.");
					b.setLend("X");
				} else
					System.out.println("대출이 불가능한 도서입니다!!");
				break;
			case 2:
				if (b.getLend() == "X") {
					System.out.println("반납이 완료되었습니다.");
					b.setLend("O");
				} else
					System.out.println("반납이 불가능한 도서입니다!!");
				break;
			case 3:
				System.out.println("초기화면으로 돌아가겠습니다.");
				lend = false;
				break;
			}

		}

	}

}
