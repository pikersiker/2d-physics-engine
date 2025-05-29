package object;

import org.joml.*;

public class Square extends Shape {
    private double length;

    public Square() {
        super();
        this.length = 0.0;
    }

    public double getLength() {
        return length;
    }

    public double[] getPosition() {
        return super.getPosition();
    }

    public void changeLength(double newLength) {
        this.length = newLength;
    }

    public double[][] getVertices() {
        double[] position = getPosition();
        double length = getLength();

        double[] vertexA = {position[0] - length/2, position[1] + length/2};
        double[] vertexB = {position[0] + length/2, position[1] + length/2};
        double[] vertexC = {position[0] + length/2, position[1] - length/2};
        double[] vertexD = {position[0] - length/2, position[1] - length/2};

        return new double[][] {vertexA, vertexB, vertexC, vertexD};
    }
}
