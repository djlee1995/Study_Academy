import java.util.*;

class add {
	Scanner sc = new Scanner(System.in);
	Book[] obj = new Book[100];

	int count = 0;
	

	void add() {
		System.out.println("======================================================");
		System.out.println("              ###도서 등록###");
		System.out.println("등록할 도서의 제목을 입력해주세요 .");
		String title = sc.next();
		System.out.println("등록할 도서의 저자를 입력해주세요 .");
		String author = sc.next();
		
		// 도서추가
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] == null) {
				count++;
				obj[i] = new Book(count, title, author);
				System.out.println("등록이 완료되었습니다!!");
				System.out.println("======================================================");
				break;
			}
		}
	}

}
