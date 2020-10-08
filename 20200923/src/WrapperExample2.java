class WrapperExample2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			total += Integer.parseInt(args[cnt]);
		}
		System.out.println(total);
	}
}