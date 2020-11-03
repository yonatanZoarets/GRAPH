package Primitives;

public class Point3D {
    private Coordinate x, y, z;

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {//using Coordinates and not doubles for saving data
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void setX(Coordinate x) {
        this.x = x;
    }

    public void setY(Coordinate y) {
        this.y = y;
    }

    public void setZ(Coordinate z) {
        this.z = z;
    }
    public double getDistance(Point3D anotherPoint){
        return 0;//yet not calculated
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}