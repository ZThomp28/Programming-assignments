
public class Circle {
private double radius;
final double pi=3.14159;
	
	public Circle (double r) {
		radius=r;
	}
	public void setRadius(int r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getarea() {
		return pi*radius*radius;
	}
	public double diameter() {
		return radius*2;
	}
	public double getCircumference() {
		return 2 * pi *radius;
	}
}
