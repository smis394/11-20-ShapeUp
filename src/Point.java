// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
import java.lang.Math;

public class Point {
  int x;
  int y;
 
  public Point (int a, int b) {
    x = a;
    y = b;
  }
  
  public Point () {
    x = 0;
    y = 0;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public double DistanceFromOrigin() {
    double d = Math.sqrt((x * x) + (y * y));
    return d;
  }
  
  public double distance (Point p) {
    double d = Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
    return d;
  }
  
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
  public void setX (int x1) {
    x = x1;
  }
  
  public void setY (int y2) {
    y = y2;
  }
  
  public void translate (int x1, int y1) {
    x += x1;
    y += y1;
  }
}
  
