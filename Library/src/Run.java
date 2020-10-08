import java.util.*;

public class Run {
		Book[] book = new Book[100];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("      ###도서관리프로그램###   ");
			System.out.println("=============================");
			System.out.println("1.도서추가  2.도서목록   도서삭제   .대출    .반납  종료 ");
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
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}

		}
	}
	public void  add() {
	    System.out.println("등록할 도서의 제목을 입력해주세요 .");
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
