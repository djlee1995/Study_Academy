import java.util.*;

class ArrayListExample2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Æ÷µµ");
		list.add("µþ±â");
		list.add("º¹¼þ¾Æ");
		list.add(2, "Å°À§");
		list.set(0, "¿À·»Áö");
		list.remove(1);
		list.remove("Å°À§");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
		System.out.println("-------------------------");
		for (String str:list) {

			System.out.println(str);
		}
	}
}
