
class WrapperExample5 {
	public static void main(String args[]) {
		printDouble(new Double(123.45));
		printDouble(123.45);
	}

	static void printDouble(Double obj) {
		System.out.println(obj);
	}
}
