

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.47",9000);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "Hello, Server";
			out.write(str.getBytes());
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}
			catch(Exception e) {
				
			}
		}
	}
}
