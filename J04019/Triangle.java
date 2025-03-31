package J04019;

public class Triangle {

    private Point p1, p2, p3;

    private double c1, c2, c3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        c1 = p1.distance(p2); c2 = p1.distance(p3); c3 = p2.distance(p3);
    }

    public boolean valid(){
        return c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1;
    }

    public String getPerimeter(){
        if(!valid()) return null;
        return String.format("%.3f", c1 + c2 + c3);
    }

}
