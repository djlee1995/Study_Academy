
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {
	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in);
		try {
			while (true) {
				char ch = (char) reader.read();
				System.out.println("�Էµ� ���� : " + ch);
				if (ch == '.') {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println(" Ű���� �Է� ����");
		}

	}

}