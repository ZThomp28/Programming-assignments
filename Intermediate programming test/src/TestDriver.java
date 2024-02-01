
public class TestDriver {
 
      public static void main(String args[]) {
             Point point = new Point(10, 5);
      Circle circle = new Circle(10.5, 20, 19);
      Cylinder cylinder = new Cylinder(12, 3.6, 20, 20);
      
      
      System.out.println("Point");
      System.out.println(point.toString()) ;
      System.out.println("Circle");
      System.out.println(circle.toString());
      System.out.println("Cylinder");
      System.out.println(cylinder.toString());
      }
}
