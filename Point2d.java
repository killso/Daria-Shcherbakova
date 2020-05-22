import java.awt.geom.Point2D;

public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public Point2d() {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

@Override
public boolean equals(Object ob){
  if (ob == null ) return false;
  if (this == ob) return true;
  if (this.getClass()!= ob.getClass());
  return false;
 Point2d p = (Point2d)ob;
return this.xCoord == p.xCoord && this.yCoord == p.yCoord;

}
}
