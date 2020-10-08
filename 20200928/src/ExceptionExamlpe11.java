
public class ExceptionExamlpe11 {
	public static void main(String[] args) {
		try {
			int result = subtract(5,100);
			System.out.println(result);
		} catch (InvalidInputException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}
	static int subtract(int a, int b) throws InvalidInputException{
		if(a<b)
			throw new InvalidInputException();
		return a-b;
	}
}
