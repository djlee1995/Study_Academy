
public class ExceptionExamlpe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= new int[0];
			System.out.println("합계: "+ getTotal(arr));
			System.out.println("평균: "+getAverage(arr));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	static double getAverage(int arr[])throws Exception{
		if(arr.length==0)
			throw new Exception("비어잇는 배열입니다.");
		return getTotal(arr) / arr.length;
	}
	static int getTotal(int arr[]) throws Exception {
		if (arr.length==0)
			throw new Exception("비어있는 배열입니다.");
		int total = 0;
		for (int num : arr)
			total+= num;
		return total;
	}

}
