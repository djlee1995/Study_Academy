
public class ExceptionExamlpe1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int sum = 1+ -2;
		if (sum<0) 
			throw new Exception("���� �߻�");
		System.out.println(sum);
		
	}

}
