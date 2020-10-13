

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
			socket = serverSocket.accept(); //.accept() ������, �����û ������ �޼����� ������ Ŭ���̾�Ʈ�� �����Ҽ� �ִ� ���� ��ü ���� ����
			InputStream in = socket.getInputStream(); // ���ſ밴ü
			OutputStream out = socket.getOutputStream();// �۽ſ밴ü
			byte arr[] = new byte[100];
			in.read(arr); //�޽��� ����
			System.out.println(new String(arr));
			String str = "Hello, Client";
			out.write(str.getBytes()); //�޽��� �۽�
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
