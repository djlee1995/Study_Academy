import java.util.GregorianCalendar;

class ObjectExample7 {
	public static void main(String args[]) {
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}