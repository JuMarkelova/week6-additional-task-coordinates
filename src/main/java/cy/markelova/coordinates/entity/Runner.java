package cy.markelova.coordinates.entity;

import cy.markelova.coordinates.util.Actions;

public class Runner {

    public void runMath() {
        Dot dotFirst = new Dot();
        Dot dotSecond = new Dot();
        System.out.printf("The length of the segment is equal to %.2f.\nThe result is rounded to decimal places.",
                Actions.calculateLengthSegment(dotFirst, dotSecond));
    }
}