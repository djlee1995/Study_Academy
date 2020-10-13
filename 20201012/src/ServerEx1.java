

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept(); //.accept() 대기상태, 연결요청 수락시 메세지를 보내온 클라이언트와 연결할수 있는 소켓 객체 만들어서 연결
			InputStream in = socket.getInputStream(); // 수신용객체
			OutputStream out = socket.getOutputStream();// 송신용객체
			byte arr[] = new byte[100];
			in.read(arr); //메시지 수신
			System.out.println(new String(arr));
			String str = "Hello, Client";
			out.write(str.getBytes()); //메시지 송신
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
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
		}
	}

}
