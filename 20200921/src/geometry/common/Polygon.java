package geometry.common;

public class Polygon {
	protected int x[]; // ²ÀÁöÁ¡ÀÇ X ÁÂÇ¥
	protected int y[]; // ²ÀÁöÁ¡ÀÇ Y ÁÂÇ¥

	protected Polygon(int vertexNum) {
		x = new int[vertexNum];
		y = new int[vertexNum];
	}

	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}