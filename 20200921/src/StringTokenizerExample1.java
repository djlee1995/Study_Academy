import java.util.StringTokenizer;

class StringTokenizerExample1 {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer("���,�� |������",",|");
		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}