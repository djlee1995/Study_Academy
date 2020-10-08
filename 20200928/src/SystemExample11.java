
public class SystemExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		double total = 0.0;
		for (int cnt =1; cnt < 100000; cnt +=2) {
			if (cnt/2%2==0)
				total += 1.0/cnt;
			else 
				total -= 1.0 / cnt;
		double pi = total *4;
		long time2 = System.currentTimeMillis();
		System.out.println("result"+ pi);
		System.out.printf("계산이 %d ms가 소요되었습니다.", time2=time1);
		}
		
	}

}
