import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main (String args[]) {
        Main m = new Main();

        List<double[]> input = new ArrayList<>();

        input.add(new double[]{5,3});
        input.add(new double[]{1,2});
        input.add(new double[]{1,2});
        input.add(new double[]{50,60});
        input.add(new double[]{6,6});

        for (Point p : m.getClosestPoints(input, 2)) {
            System.out.println(p);
        }

    }

    public List<Point> getClosestPoints(List<double[]> coords, int noOfPoints) {
        List<Point> pointsWithDistance = new ArrayList<>();

        for (double[] coord : coords) {
            double distanceFromOrigin = getDistanceFromOrigin(coord[0], coord[1]);
            pointsWithDistance.add(new Point(coord, distanceFromOrigin));
        }

        Collections.sort(pointsWithDistance);

        return pointsWithDistance.subList(0, noOfPoints);
    }

    public double getDistanceFromOrigin(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    class Point implements Comparable<Point>{
        double[] coords;
        double distance;

        public Point(double[] coords, double distance) {
            this.coords = coords;
            this.distance = distance;
        }

        public double[] getCoords() {
            return coords;
        }

        public double getDistance() {
            return distance;
        }

        public int compareTo(Point other) {
            if (other.getDistance() < this.getDistance()) {
                return 1;
            } else {
                return -1;
            }
        }

        public String toString() {
            return "x: " + this.coords[0] + ", y: " + this.coords[1] + ", distance: " + this.getDistance();
        }
    }
}