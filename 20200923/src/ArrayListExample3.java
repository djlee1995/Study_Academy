import java.util.*;

class ArrayListExample3 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		int cnt=0,i;
		for (i=0; i< list.size();i++) {
			if(list.get(i).equals("���")) {
				cnt++;
				if(cnt==3)
					break;
			}
		}
		System.out.println("3��° ���: " + i);
	}
}
