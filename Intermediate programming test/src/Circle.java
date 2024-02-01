
public class Circle extends Point{
      protected double radius;
      public Circle(){
             setRadius(0);
      }
      public Circle(double cr, int x, int y) {
             radius=cr;
             setPoint(x,y);
      }
      public void setRadius(double cr) {
             radius = (cr >=0 ? cr:0);
      }
      public double getradius() {
             return radius;
      }
      public double area() {
             return Math.PI* radius*radius;
      } 
     
}

