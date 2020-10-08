
public class PrintThread1 extends Thread {
	SharedArea1 sharedArea1;

	PrintThread1(SharedArea1 area1) {
		sharedArea1 = area1;
	}

	public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea1.getTotal();
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
		}

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
