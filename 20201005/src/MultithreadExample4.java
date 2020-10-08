
public class MultithreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea=obj;
		thread2.sharedArea=obj;
		thread1.start();
		thread2.start();

	}

}
