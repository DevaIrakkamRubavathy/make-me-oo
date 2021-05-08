package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(xDistance(from, to), 2) + Math.pow(yDistance(from, to), 2));
    }

    public static double direction(Point from, Point to) {
        return Math.atan2(yDistance(from, to), xDistance(from, to));
    }

    public static double xDistance(Point from, Point to) {
        return to.getX() - from.getX();
    }

    public static double yDistance(Point from, Point to) {
        return to.getY() - from.getY();
    }
}
