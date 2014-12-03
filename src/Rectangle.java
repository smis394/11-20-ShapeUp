// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.util.*;

public class Rectangle
{
  Point origin;
  int width;
  int height;
  
  public Rectangle() 
  {
    origin = new Point();
    width = 0;
    height = 0;
  }
  
  public Rectangle(Point g, Point b)
  {
    origin = g;
    width = b.x - g.y;
    height = b.y - g.y;
  }
  
  public Rectangle(Point g, int x, int y) 
  {
    origin = g;
    width = g.x-x;
    height = g.y-y;
  }
  
  public Point getBottomLeft()
  {
    return origin;
  }
  
  public Point getTopRight() 
  {
    Point gl = new Point();
    gl.x = origin.x + width;
    gl.y = origin.y + height;
    return gl;
  }
  
  public int getHeight() {
    return height;
  }
  
 public int getWidth() {
    return width;
  }
  
  public double area() {
    return width * height;
  }
  
  public double diagonal() {
    return Math.sqrt((width * width) + (height * height));
  }
  
  public int perimeter() 
  {
    return (2 * width) + (2 * height);
  }
  
  public boolean isSquare() 
  {
    boolean Square = false;
    if (width == height) 
    {
      Square = true;
    }
    return Square;
  }
  
  public String toString() 
  {
    return "[" + origin.toString() + ", " + getTopRight().toString() + "]";
  }
  
  public void translate(int x, int y)
  {
    origin.x += x;
    origin.y += y;
  }
  
  public void scale(int dx, int dy)
  {
    width += dx;
    height += dy;
  }
}
