
/**
 * Created by madhu on 5/18/2017.
 */
public class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }


    public float getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void Draw() {
        System.out.println("Drawing circle..");
    }

    @Override
    public float area() {
        float a=0;
       //float radius;
        a=(float)(Math.PI*radius*radius);
        return a;
    }

}
