package J04001;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private final double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        return sqrt(pow(this.x - p2.x, 2) + pow(this.y - p2.y, 2));
    }

    public static double distance(Point p1, Point p2){
        return p1.distance(p2);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
