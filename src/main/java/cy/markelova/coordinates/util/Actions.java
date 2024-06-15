package cy.markelova.coordinates.util;

import cy.markelova.coordinates.entity.Dot;

public class Actions {

    public static double calculateLengthSegment(Dot dotFirst, Dot dotSecond) {
        return Math.sqrt(Math.pow(dotSecond.getCoordinateX() - dotFirst.getCoordinateX(), 2) +
                Math.pow(dotSecond.getCoordinateY() - dotFirst.getCoordinateY(), 2));
    }
}