import object.Shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getLength());
        System.out.println(Arrays.toString(shape.getPosition()));
    }
}
