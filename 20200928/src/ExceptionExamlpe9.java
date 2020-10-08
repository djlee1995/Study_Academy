import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExamlpe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("파일을 찾을 수 없습니다.");
		}
		catch(IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		}
	}

}
