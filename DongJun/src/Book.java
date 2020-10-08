public class Book {
// 도서관리 번호
	private int num;
// 도서 제목
	private String name;
// 도서 저자
	private String writer;
// 도서대출 여부	
	private String lend= "O";

	public Book() {
	}

	public Book(int num, String name, String writer) {
		super();
		this.num = num;
		this.name = name;
		this.writer = writer;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getLend() {
		return lend;
	}
	public void setLend(String lend) {
		this.lend=lend;
	}

}
