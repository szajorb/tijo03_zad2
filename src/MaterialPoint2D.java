public class MaterialPoint2D extends Point2D {

    double mass;

    public MaterialPoint2D(double x, double y, double mass) {
        super(x, y);
        this.mass = mass;
    }


    @Override
    public String toString() {
        return "mass=" + mass;
    }

    public double getMass() {
        return mass;
    }

}