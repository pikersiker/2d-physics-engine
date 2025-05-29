import object.Shape;
import object.Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Square();
        System.out.println(Arrays.toString(shape.getPosition()));
        System.out.println(((Square) shape).getLength());

    }
}
