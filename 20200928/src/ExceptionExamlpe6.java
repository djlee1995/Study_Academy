
public class ExceptionExamlpe6 {
	public static void main(String args[]) {
		int num1 = 2, num2 =3 ;
		try {
			int result = num1-num2;
			if(result<0)
				throw new Exception();
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			String str =e.getMessage();
			System.out.println(str);
		}
	}
}
