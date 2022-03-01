public class Calculations {


    public static Point2D positionGeometricCenter(Point2D[] point) {
        double sumX = 0.0;
        double sumY = 0.0;
        for (Point2D pt : point) {
            sumX += pt.getX();
            sumY += pt.getY();
        }

        sumX = sumX / point.length;
        sumY = sumY / point.length;

        return new Point2D(sumX, sumY);
    }

    public static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoint) {
        double sumX = 0.0;
        double sumY = 0.0;
        int mass = 0;
        for (MaterialPoint2D pt : materialPoint) {
            sumX += pt.getX() * pt.getMass();
            sumY += pt.getY() * pt.getMass();
            mass += pt.getMass();
        }
        sumX = sumX / materialPoint.length;
        sumY = sumY / materialPoint.length;

        return new MaterialPoint2D(sumX, sumY, mass);
    }
}