package Test1;

public class PersonEx01 {
	final static int Max = 100;
	
	public static void main(String[] args) {
		Sungjuk obj1[] = new Sungjuk[Max];//성적객체를 보관할 주소를 만듬
		PersonInfo obj2[] = new PersonInfo[Max];
		int i, obj1_cnt=0,obj2_cnt=0;
		
		System.out.println("### 성적입력 ###");
		obj1_cnt=inputData(obj1);//공부
		System.out.println("\n### 개인정보 입력 ###");
		obj2_cnt=inputData(obj2);//공부
		System.out.println("\n     ***성적표 출력***");
		System.out.println("=================================");
		System.out.println("학번    이름   국어   영어   수학   총점   평균   등급");
		System.out.println("=================================");
		printData(obj1,obj1_cnt);//실매개변수
		System.out.println("=================================");
		
		System.out.println("\n     ***개인정보 ***");
		System.out.println("=================================");
		System.out.println(" 학번    이름      주소          전화번호      이메일");
		System.out.println("=================================");
		printData(obj2,obj2_cnt);
		System.out.println("=================================");
	}
	
	static int inputData(Personable obj[]) {
		int i, cnt=0;
		if(obj instanceof Sungjuk[]) {
			Sungjuk[] data= (Sungjuk[]) obj;
			
			for (i=0; i<Max; i++) {
				data[i] = new Sungjuk();//성적클래스로 객체화
			if (data[i].input())
				break;
			
			data[i].process();
				cnt++;
			System.out.println();
		}
			
		}
		else {
			PersonInfo[] data= (PersonInfo[]) obj;
			for (i=0; i<Max; i++) {
				data[i]=new PersonInfo();
				if (data[i].input())
					break;
				
				cnt++;
				System.out.println();
			
		}
		}
			
		return cnt;
	}
	
	static void printData(Personable obj[],int cnt) {
		for (int i=0; i<cnt;i++) {
			obj[i].output(); //output()메서드에 대한 다형성 구형
		}
	}

}
