import java.util.*;

class LinkedListExample1 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Æ÷µµ");
		list.add("µþ±â");
		list.add("º¹¼þ¾Æ");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
