
class TransferThread extends Thread {
	SharedArea1 sharedArea1;

	TransferThread(SharedArea1 area1) {
		// TODO Auto-generated constructor stub
		sharedArea1 = area1;
	}

	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			sharedArea1.transfer(100);
			}

		}
	}

