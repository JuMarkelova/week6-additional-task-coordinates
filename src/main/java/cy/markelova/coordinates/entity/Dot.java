package cy.markelova.coordinates.entity;

public class Dot {
    private final int COORDINATE_X;
    private final int COORDINATE_Y;

    public Dot(int x, int y) {
        this.COORDINATE_X = x;
        this.COORDINATE_Y = y;
    }

    public int getCoordinateX() {
        return COORDINATE_X;
    }

    public int getCoordinateY() {
        return COORDINATE_Y;
    }
}