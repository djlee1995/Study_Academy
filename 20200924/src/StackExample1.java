import java.util.*;

class StackExample1 {
	public static void main(String args[]) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		while (!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
		}
	}
}