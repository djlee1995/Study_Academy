
public class ExceptionExamlpe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = devide(3,0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("에러발생:"+ e.getMessage());
		}
	}
	static int devide(int a , int b) {
		int result = a/b;
		return result;
	}

}
