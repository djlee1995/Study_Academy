

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
			socket = serverSocket.accept(); //.accept() ������, �����û ������ �޼����� ������ Ŭ���̾�Ʈ�� �����Ҽ� �ִ� ���� ��ü ���� ����
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ���ſ밴ü
			PrintWriter writer = new PrintWriter(socket.getOutputStream());// �۽ſ밴ü
			String str = reader.readLine();
			System.out.println(str);
			writer.println("Hello, Client");
			writer.flush();//�� ���۸� ������ ��ﶧ ��� (������ ���۰� �� ä������ �����)
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
