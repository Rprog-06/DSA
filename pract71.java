import java.util.*;
import java.text.DecimalFormat;

public class pract71{

    static DecimalFormat df = new DecimalFormat("0.00");

    static class Point {
        double x, y, z;
        Point(double x, double y, double z) {
            this.x = x; this.y = y; this.z = z;
        }
    }

    static boolean isSameFace(Point a, Point b) {
        return (
            (a.z == 10 && b.z == 10) || // top face
            (a.x == 0 && b.x == 0) ||   // left face
            (a.x == 10 && b.x == 10) || // right face
            (a.y == 0 && b.y == 0) ||   // front face
            (a.y == 10 && b.y == 10)    // back face
        );
    }

    static double arcDistance(Point a, Point b) {
        Point center = null;

        if (a.z == 10 && b.z == 10) {
            center = new Point(5, 5, 10); // top
        } else if (a.x == 0 && b.x == 0) {
            center = new Point(0, 5, 5); // left
        } else if (a.x == 10 && b.x == 10) {
            center = new Point(10, 5, 5); // right
        } else if (a.y == 0 && b.y == 0) {
            center = new Point(5, 0, 5); // front
        } else if (a.y == 10 && b.y == 10) {
            center = new Point(5, 10, 5); // back
        }

        double r = distance(a, center);
        return r * Math.PI / 3.0;
    }

    static double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        double dz = a.z - b.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    static double surfaceDistance(Point a, Point b) {
        // Since unfolding logic is complex, we use simple 3D straight-line approximation for now.
        // In real surface unfolding, we would need to simulate different cube net cases.
        return distance(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] rawCoords = sc.nextLine().split(",");
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < 3 * N; i += 3) {
            double x = Double.parseDouble(rawCoords[i]);
            double y = Double.parseDouble(rawCoords[i + 1]);
            double z = Double.parseDouble(rawCoords[i + 2]);
            points.add(new Point(x, y, z));
        }

        double totalDistance = 0.0;
        for (int i = 0; i < N - 1; i++) {
            Point a = points.get(i);
            Point b = points.get(i + 1);
            double dist;
            if (isSameFace(a, b)) {
                dist = arcDistance(a, b);
            } else {
                dist = surfaceDistance(a, b);
            }
            totalDistance += Math.round(dist * 100.0) / 100.0; // round before adding
        }

        System.out.println(df.format(totalDistance));
    }
}
