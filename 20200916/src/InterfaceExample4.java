class InterfaceExample4 {
	public static void main(String args[]) {
		Rectangle obj= new Rectangle(100, 200, 10, 10);
		printRectangle(obj);
		obj.MoveTo(25,35);
		printRectangle(obj);
		obj.MoveBy(-5, -5);
		obj.resize(30, 30);
	}
	static void printRectangle(Rectangle obj) {
		System.out.printf("�簢��: ��ġ(%d,%d),ũ��(%d,%d) %n",
				obj.x,obj.y,obj.width,obj.height);
	}

}
