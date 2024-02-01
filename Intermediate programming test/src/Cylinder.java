
public class Cylinder extends Circle{
      protected double height;
      public Cylinder() {
             setHeight(0);
      }
      public Cylinder(double h, double radius, int x, int y) {
    	  setPoint(x,y);
    	  setRadius(radius);
    	  height=h;
             
      }
      public void setHeight(double h) {
             height = (h >= 0 ? h:0);
      }
      public double area() {
             return 2*Math.PI*Math.pow(radius,2) +2*Math.PI*radius*height;
//Assuming the area = 2*PI*r2 +2*Pi*r*height
      }
      public String toString() {
             return super.toString() + "; Height = " + height;
      }
}

