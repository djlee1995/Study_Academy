
public class ExceptionExamlpe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= new int[0];
			System.out.println("�հ�: "+ getTotal(arr));
			System.out.println("���: "+getAverage(arr));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	static double getAverage(int arr[])throws Exception{
		if(arr.length==0)
			throw new Exception("����մ� �迭�Դϴ�.");
		return getTotal(arr) / arr.length;
	}
	static int getTotal(int arr[]) throws Exception {
		if (arr.length==0)
			throw new Exception("����ִ� �迭�Դϴ�.");
		int total = 0;
		for (int num : arr)
			total+= num;
		return total;
	}

}
