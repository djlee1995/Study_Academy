import java. io.*;
public class SystemExample2 {
	public static void main(String args[]){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = reader.readLine();
			System.out.println("�Էµ� ���ڿ�: "+str);
		} catch (IOException e) {
			System.out.println("Ű���� �Է� ����");
			// TODO: handle exception
		}
	}
}
