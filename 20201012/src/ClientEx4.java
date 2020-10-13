

import java.net.Socket;

public class ClientEx4 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: java ClientEx4 <user-name>");
			return;
		}
		try {
			Socket socket = new Socket("192.168.0.41",9002);
			Thread thread1 = new PolysenderThread(socket, args[0]);
			Thread thread2 = new PolyReceiverThread2(socket);
			thread1.start();
			thread2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
