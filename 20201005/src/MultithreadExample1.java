
public class MultithreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new DigitThread();
		thread.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}
}