

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept(); //.accept() 대기상태, 연결요청 수락시 메세지를 보내온 클라이언트와 연결할수 있는 소켓 객체 만들어서 연결
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 수신용객체
			PrintWriter writer = new PrintWriter(socket.getOutputStream());// 송신용객체
			String str = reader.readLine();
			System.out.println(str);
			writer.println("Hello, Client");
			writer.flush();//행 버퍼를 강제로 비울때 사용 (원래는 버퍼가 다 채워져야 비워짐)
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
