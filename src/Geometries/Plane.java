package Geometries;

import Primitives.Point3D;
import Primitives.Vector;

public class Plane extends Geometry{
    private Point3D point;
    private Vector vector;
    public  Plane(Point3D point,Vector vector){
        this.point=point;
        this.vector=vector;

    }

    @Override
    public String toString() {
        return "Plane{" +
                "point=" + point +
                ", vector=" + vector +
                '}';
    }
}
