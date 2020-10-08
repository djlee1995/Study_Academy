class Book {
	private int num;
	private String irum;
	private boolean lend;
	public Book() {

	}

	public Book(int num, String irum,boolean lend) {
		this.num = num;
		this.irum = irum;
		this.lend=lend;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}
	public boolean getLend() {
		return lend;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}


	
}
