package Geometries;

import Primitives.Ray;

public class Cylinder extends Geometry {
    double radius,height;
    Ray axis;
    public Cylinder (Ray axis,double height,double radius){
        this.axis=axis;
        this.height=height;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getScope() {
        return 2*radius*3.14;
    }

    @Override
    public double getVolume() {
        return this.getArea()*height;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2)*3.14;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", axis=" + axis +
                '}';
    }

    @Override
    public double getHeight() {
        return height;
    }
}
