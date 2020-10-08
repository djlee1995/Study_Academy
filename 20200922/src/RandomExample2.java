import java.util.*;

class RandomExample2 {
	public static void main(String args[]) {
		Random random = new Random(349239L);
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}
}