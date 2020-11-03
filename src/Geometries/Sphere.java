package Geometries;

import Primitives.Point3D;

public class Sphere extends Geometry {
    private Point3D center;
    private double radius;
    public Sphere(float radius, Point3D center) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getScope() {
        return 2*radius*3.14;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.radius,3)*3.14/3;
    }

    @Override
    public String toString() {
        return "Sphere{ " +
                "center= " + center +
                ", radius= " + radius +
                "}";
    }

    public double getRadius() {
        return radius;
    }
}
