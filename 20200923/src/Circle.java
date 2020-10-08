public class Circle {
	public int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		if(!(obj instanceof Circle))
			return false;
		Circle circle =(Circle)obj;
		if(radius==circle.radius)
			return true;
		else
			return true;
	}

}
