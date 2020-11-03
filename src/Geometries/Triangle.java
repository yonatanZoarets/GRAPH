package Geometries;

import Primitives.Point3D;

public class Triangle extends Geometry  {
    private Point3D p1,p2,p3;
    public Triangle(Point3D p1,Point3D p2,Point3D p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getScope() {
        return p1.getDistance(p2)+p2.getDistance(p3)+p3.getDistance(p1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1= " + p1 +
                ", p2= " + p2 +
                ", p3= " + p3 +
                '}';
    }
}
