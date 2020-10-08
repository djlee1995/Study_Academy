import java.util.*;

class updateBook extends Book {
	Book book = new Book();
	Scanner sc = new Scanner(System.in);

	void updateBook() {
		while (true) {
			int cnt = 0;
			System.out.println("도서 번호 입력해주세요");
			String bunho = sc.next();
			if (bunho.equals(book.getNum())) {
				cnt++;
				System.out.println("도서 번호 중복!! 다시입력해주세요.");
				break;

			}
			if (cnt == 0) {
				book.setNum(bunho);
			}
		}
		System.out.println("책 제목 입력");
		book.setIrum(sc.nextLine());
		book.setLend(true);

		System.out.println("도서번호 : " + book.getNum());
		System.out.println("도서제목 : " + book.getIrum());
		System.out.println("대여가능 : " + book.getLend());

		System.out.println("도서를 추가할까요? 예(y) 아니오(n)");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			// 책을 추가
			System.out.println("======입력 완료=====");
			break;
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("추가하실 도서를 다시입력해주세요.");
		} else {
			System.out.println("오류!! 초기 화면으로 이동하겠습니다.");
			break;
		}
	}

}
