class StringExample1 {
	public static void main(String args[]) {
		String str = "�ڹ� Ŀ��";
		int len = str.length(); // length �޼ҵ� ȣ��
		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); // charAt �޼ҵ� ȣ��
			System.out.println(ch);
		}
	}
}