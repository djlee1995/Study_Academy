import Test1.Sungjuk;
class ObjectExample6 {
	public static void main(String args[]) {
		Sungjuk obj1 = new Sungjuk();
		obj1.input();
		Sungjuk obj2 = (Sungjuk)obj1.clone();
		obj2.input();
		if (obj1.equals(obj2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}
}