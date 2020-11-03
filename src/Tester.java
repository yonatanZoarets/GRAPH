import Geometries.Cylinder;
import Geometries.Polygon;
import Geometries.Sphere;
import Geometries.Triangle;
import org.junit.jupiter.api.Test;
import Primitives.Coordinate;
import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {
    Coordinate x=new Coordinate(3);
    Coordinate y=new Coordinate(5);
    Coordinate z=new Coordinate(1);
    Point3D point3D=new Point3D(x,y,z);
    Vector vector=new Vector(point3D);
    Sphere sphere= new Sphere(2,point3D);
    Ray ray=new Ray(point3D,vector);
    Cylinder cylinder=new Cylinder(ray,5,3);
//writed here to avoid repeated rows

//    @Test
//    void getArea() {
//    }
    @Test
    void getScope() {
        assertEquals(2*3*3.14,cylinder.getScope());//radius*2*3.14
        assertEquals(2*2*3.14,sphere.getScope());//radius*2*3.14
    }

    @Test
    void testGetVolume() {
        assertEquals((2*2*2)*3.14/3,sphere.getVolume());//(radius^3)*3.14*height
        assertEquals((3*3)*3.14*5,cylinder.getVolume());//(radius^2)*3.14*height
    }

    @Test
    void testSphereToString() {
        assertEquals("Sphere{ " +
                "center= " + point3D +
                ", radius= " + sphere.getRadius() +
                "}",sphere.toString() );//sphere test

        assertEquals("Cylinder{" +
                "radius=" + cylinder.getRadius() +
                ", height=" + cylinder.getHeight() +
                ", axis=" + ray +
                '}',cylinder.toString() );//cylinder test

        Triangle triangle=new Triangle(point3D,point3D,point3D);//only for checking
        ArrayList<Point3D> list=new ArrayList<>();
        Polygon polygon=new Polygon(list);

        assertEquals("Triangle{" +
                "p1= " + point3D +
                ", p2= " + point3D +
                ", p3= " + point3D +
                '}',triangle.toString());
        assertEquals("Polygon{" +
                "points3d= " + list +
                '}',polygon.toString());

    }//unnecessary method for each geometry

}