package Geometries;

import Primitives.Point3D;

import java.util.List;

public class Polygon extends Geometry {
    List<Point3D> points3d;
    public Polygon(List<Point3D> point3DS){
        this.points3d=point3DS;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points3d= " + points3d +
                '}';
    }
}
