
public class Point extends Shape{
      private int x,y;
      public Point() {
             setPoint(0,0);
      }
      public Point(int x, int y) {
             setPoint(x,y);
      }
      public void setPoint(int x, int y) {
             this.x = x;
             this.y = y;
      }
      public int getX() {
             return x;
 
      }
      public String toString() {
             return "(" + x + ", " + y + ")";
      }
}

