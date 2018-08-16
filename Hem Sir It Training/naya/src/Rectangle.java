

/**
 * Created by madhu on 5/18/2017.
 */
public class Rectangle extends Shape {
    private int l,b;
    Point p1,p2,p3,p4;

    public Rectangle(int l, int b,Point p1,Point p2,Point p3, Point p4) {
        this.l = l;
        this.b = b;
        this.p1=p1;
        this.p3=p3;
        this.p4=p4;

    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public float area() {
        int a=0;
        a=l*b;
        return a;
    }
}
