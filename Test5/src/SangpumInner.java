import java.util.ArrayList;
import java.util.Scanner;

public class SangpumInner {

	public SangpumInner() {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Sangpum> list = new ArrayList<Sangpum>();

	public ArrayList<Sangpum> getlist() {
		return list;
	}

	void addSangpum(Sangpum obj) {
		list.add(obj);
		System.out.println("상품이 추가되었습니다.");
	}

	void removeSangpum(Sangpum obj) {
		list.remove(obj);
		System.out.println("상품이 삭제되었습니다.");
	}

	Sangpum getSangpum(int index) {
		return list.get(index);
	}

	boolean checkSangpum(Sangpum obj) {
		for (Sangpum dat : list) {
			if (dat.code.equals(obj.code)) {
				return true;
			}
		}
		return false;
	}

	int getSungjukNum() {
		return list.size();
	}

	int getTotal() {
		int total = 0;
		for (Sangpum obj : list)
			total += obj.count*obj.price;

		return total;
	}

	class Sangpum {
		String code, name;
		int count, price;
		String estimate = "보통";

		Sangpum() {

		}

		void input_Sangpum() {
			Scanner scan = new Scanner(System.in);
			System.out.println("코드를 입력=> ");
			code = scan.next();
			System.out.println("상품명을 입력=> ");
			name = scan.next();
			System.out.println("수량을 입력=> ");
			count = scan.nextInt();
			System.out.println("단가 입력=> ");
			price = scan.nextInt();

		}

		void output_Sangpum() {
			System.out.printf("%2s %5s %4d  %4d %4d %5s\n", code, name, count, price, count*price, estimate);
		}

	}
}
