
import java.util.Scanner;

public class Sangpum {
	String code, irum, grade;
	int count, price, sum;
	static int cnt = 0;
	static int total_price = 0; // 금액 누계(총판매금액

	Sangpum() {

	}

	boolean input_sangpum() { // 데이터 입력받는
		Scanner scan = new Scanner(System.in);
		System.out.print("상품코드 입력 => ");
		code = scan.next();
		if (code.equals("exit"))
			return true; // 삭제하는것이 좋다 리턴할 값이 없으니까 이제는
		System.out.print("상품명 입력 => ");
		irum = scan.next();
		System.out.print("수량 입력 => ");
		count = scan.nextInt();
		System.out.print("단가 입력 => ");
		price = scan.nextInt();
		return false;
		// return; 생략가능

		// void메소드로 작성해도된다
	}

	void process_sangpum() { // 금액 등급구하는 것
		sum = count * price;

		if (count >= 30)
			grade = "우수";
		else if (count >= 10)
			grade = "보통";
		else
			grade = "분발";
	}

	void output_sangpum() { // 필드내용으로 작성
		System.out.printf("%4s  %4s  %4d  %6d %8d %2s\n", code, irum, count, price, sum, grade);
		// 실제적인 데이터만 입력 출력시 == **단 이런건 안넣는다
	}

	static int getTotalPrice() { // 정적메소드내에서는 정적필드만 사용가능
		return total_price;
	}
}