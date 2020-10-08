
public class list extends delete {
	// 도서 목록 출력
	public void list() {
		System.out.println("======================================================");
		System.out.println("              ###도서리스트###");
		
		for (Book b : obj) {
			if (b != null) {

				System.out.println(
						"    [ 관리번호: " + b.getNum() + ", " + "책 이름: " + b.getName() + ", 저자: " + b.getWriter() +", 대출여부: "+b.getLend()+ " ]");

			}

		}
		System.out.println("======================================================");
	}

}
