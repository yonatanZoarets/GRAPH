package Primitives;

public class Ray {
    Point3D pod;
    Vector direction;
    public Ray(Point3D pod,Vector direction){
        this.pod=pod;
        this.direction=direction;
    }

    public void setDirection(Vector direction) {
        this.direction = direction;
    }
    public void setPod(Point3D pod){
        this.pod=pod;

    }
}
