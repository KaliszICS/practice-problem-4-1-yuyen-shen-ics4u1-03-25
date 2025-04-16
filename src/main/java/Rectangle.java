public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return (this.length)*(this.width);
	}

	public double perimeter() {
		return ((this.length)+(this.width))*2;
	}
}