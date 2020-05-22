public class Point3d extends Point2d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
public Point3d(){
        this (0.0,0.0,0.0);
}
public void set(double val){
        zCoord = val;
}
public double get(){
        return zCoord;
    }
public double distanceTo(Object ob){
        Point3d point = (Point3d)ob;
        return Math.sqrt(((point.xCoord-this.xCoord)*(point.xCoord-this.xCoord))+((point.yCoord-this.yCoord)*
                (point.yCoord-this.yCoord))+((point.zCoord-this.zCoord)*(point.zCoord-this.zCoord)));
}
@Override
public boolean equals(Object ob){
    if (ob == null ) return false;
    if (this == ob) return true;
    if (this.getClass()!= ob.getClass());
    return false;
    Point3d p = (Point3d) ob;
    return this.xCoord == p.xCoord && this.yCoord == p.yCoord;

}



}
