package cy.markelova.coordinates.entity;

import java.util.Scanner;

public class Dot {
    private final int COORDINATE_X;
    private final int COORDINATE_Y;

    public Dot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates X and Y of the dot separated by a space: ");
        this.COORDINATE_X = scanner.nextInt();
        this.COORDINATE_Y = scanner.nextInt();
    }

    public int getCoordinateX() {
        return COORDINATE_X;
    }


    public int getCoordinateY() {
        return COORDINATE_Y;
    }
}