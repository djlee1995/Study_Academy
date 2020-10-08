
public class SystemExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceUser obj = new ResourceUser();
		obj.use();
		obj = null;
		System.gc();
	}

}
