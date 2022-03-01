public class Point2D {

    double x = 0.0;
    double y = 0.0;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " x = " + x + " y = " + y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}

