
public class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double len, double w)
	{
	length = len;
	width = w;
	}
	
	public void setLength(double len) {
		length=len;
	}
	public void setWidth(double wid) {
		width=wid;
	}
	public double getlength() {
		return length;
	}
	public double getwidth() {
		return width;
	}
	public double getArea()
	{
	return length * width;
	}
}
