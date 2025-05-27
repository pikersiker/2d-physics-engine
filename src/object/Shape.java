package object;

public class Shape {
    private double[] position;

    public Shape() {
        this.position = new double[] {0.0, 0.0};
    }

    public Shape(double[] position) {
        this.position = position;
    }

    public double[] getPosition() {
        return position;
    }

    public void changePosition(double[] newPosition) {
        this.position = newPosition;
    }
}
