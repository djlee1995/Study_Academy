
class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		if (sharedArea.isReady != true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);

		/*
		 * while (sharedArea.isReady != true) continue;
		 * System.out.println(sharedArea.result);
		 */
	}
}
