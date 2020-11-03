package Scene;

import Geometries.Geometry;
import Geometries.Triangle;

import java.util.List;

public class Scene {
    String name;
    List<Geometry> geometries;
    public Scene(String name,List<Geometry>geometries){
        this.name=name;
        this.geometries=geometries;
    }
    public void addGeometry(Geometry geometry){
        geometries.add(geometry);
    }

    public void setGeometries(List<Geometry> geometries) {
        this.geometries = geometries;
    }
}
