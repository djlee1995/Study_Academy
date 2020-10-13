

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept(); //.accept() 대기상태, 연결요청 수락시 메세지를 보내온 클라이언트와 연결할수 있는 소켓 객체 만들어서 연결
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	/*	finally {
			try {
				socket.close();
			}
			catch(Exception ignored) {
				
			}
			try {
				serverSocket.close();
			}
			catch(Exception ignored) {
				
			}
		}*/
	}

}
