
public class MonitorThread extends Thread {
	Thread thread;
	 MonitorThread(Thread thread) {
		// TODO Auto-generated constructor stub
		 this.thread = thread;
	 }
	 public void run() {
		 while(true) {
			 Thread.State state = thread.getState();
			 System.out.println("쓰레드의 상태: "+ state);
			 if(state==Thread.State.TERMINATED)
				 break;
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
	 }
}
