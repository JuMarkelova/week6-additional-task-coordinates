package cy.markelova.coordinates.entity;

import cy.markelova.coordinates.util.Actions;

import java.util.Scanner;

public class Runner {

    public void runMath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates X and Y of the first dot separated by a space: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the coordinates X and Y of the second dot separated by a space: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Dot dotFirst = new Dot(x1, y1);
        Dot dotSecond = new Dot(x2, y2);
        System.out.printf("The length of the segment is equal to %.2f.\nThe result is rounded to decimal places.",
                Actions.calculateLengthSegment(dotFirst, dotSecond));
    }
}