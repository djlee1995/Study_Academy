import java.util.*;

class LinkedListExample3 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
	/*Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		
		}*/
		
		for (String str: list) {
			System.out.println(str);
		}
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
	}
}
