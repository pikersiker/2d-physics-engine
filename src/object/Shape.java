package object;

public class Shape {
    private int length;
    private double[] position;

    public Shape() {
        this.length = 1;
        this.position = new double[] {0, 0};
    }

    public int getLength() {
        return length;
    }

    public double[] getPosition() {
        return position;
    }
}
