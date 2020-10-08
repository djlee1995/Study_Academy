
public class update extends add {

	void update() {
		System.out.println("======================================================");
		System.out.println("              ###도서수정###");
		System.out.println("수정하실 도서의 관리번호 입력해주세요.");

		int bookNum = sc.nextInt();

		Book b = find(bookNum);

		if (b == null) {
			System.out.println("입력하신 관리번호의 도서가 존재하지 않습니다.");
			return;
		}

		boolean update = true;

		while (update) {

			System.out.println("======================================================");
			System.out.println(" 1.제목수정  2.저자수정  3.수정완료");
			System.out.println("원하시는 메뉴의 번호를 입력해주세요.");
			int user = sc.nextInt();
			System.out.println("======================================================");

			switch (user) {

			case 1:
				System.out.println("도서의 제목을 수정해주세요.");
				String name = sc.next();
				b.setName(name);
				System.out.println("제목 수정중...");
				break;
			case 2:
				System.out.println("도서의 저자를 수정해주세요.");
				String writer = sc.next();
				b.setWriter(writer);
				System.out.println("저자 이름 수정중...");
				break;
			case 3:
				System.out.println("변경하신 내용이 수정완료되었습니다.");
				update = false;
				break;
			}

		}

	}

	// 입력한 관리번호의 도서가 있는지 확인
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