
public class delete extends update  {

	void delete() {
		System.out.println("======================================================");
		System.out.println("              ###도서 삭제###");
		System.out.println("삭제할 도서의 관리번호를 입력하세요 .");
		int bookNum = sc.nextInt();
		// 다른 번호를 눌렀을 때 경고메세지
		Book b = find(bookNum);
		if (b == null) {
			System.out.println("입력하신 관리번호의 도서가 존재하지 않습니다.");
			return;
		}

		// 삭제
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] != null) {
				if (obj[i].getNum() == bookNum) {
					obj[i] = null;
					System.out.println("입력하신 도서가 삭제되었습니다!!");

					return;

				}

			}

		}
		System.out.println("======================================================");

	}

}
