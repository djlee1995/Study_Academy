package math;

import geometry.Circle;
import geometry.polygon.Rectangle;

class PackageExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8, 9);
		if (obj1.getArea() > obj2.getArea())
			System.out.println("���� ������ �� �н��ϴ�.");
		else
			System.out.println("���� ������ ���簢���� �������� �۰ų� �����ϴ�.");
	}

}
