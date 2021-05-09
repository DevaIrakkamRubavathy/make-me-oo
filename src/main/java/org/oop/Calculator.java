package org.oop;

public class Calculator {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 3);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator();
        System.out.println("Distance : " + distanceAndDirectionCalculator.distance(point1, point2));
        System.out.println("Direction : " + distanceAndDirectionCalculator.direction(point1, point2));
    }
}
