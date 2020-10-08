package Test1;

public class PersonEx01 {
	final static int Max = 100;
	
	public static void main(String[] args) {
		Sungjuk obj1[] = new Sungjuk[Max];//������ü�� ������ �ּҸ� ����
		PersonInfo obj2[] = new PersonInfo[Max];
		int i, obj1_cnt=0,obj2_cnt=0;
		
		System.out.println("### �����Է� ###");
		obj1_cnt=inputData(obj1);//����
		System.out.println("\n### �������� �Է� ###");
		obj2_cnt=inputData(obj2);//����
		System.out.println("\n     ***����ǥ ���***");
		System.out.println("=================================");
		System.out.println("�й�    �̸�   ����   ����   ����   ����   ���   ���");
		System.out.println("=================================");
		printData(obj1,obj1_cnt);//�ǸŰ�����
		System.out.println("=================================");
		
		System.out.println("\n     ***�������� ***");
		System.out.println("=================================");
		System.out.println(" �й�    �̸�      �ּ�          ��ȭ��ȣ      �̸���");
		System.out.println("=================================");
		printData(obj2,obj2_cnt);
		System.out.println("=================================");
	}
	
	static int inputData(Personable obj[]) {
		int i, cnt=0;
		if(obj instanceof Sungjuk[]) {
			Sungjuk[] data= (Sungjuk[]) obj;
			
			for (i=0; i<Max; i++) {
				data[i] = new Sungjuk();//����Ŭ������ ��üȭ
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
			obj[i].output(); //output()�޼��忡 ���� ������ ����
		}
	}

}
