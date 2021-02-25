/**
 * Test
 */
import Geometry2D.*;
import Geometry3D.*;
public class Test {

    public static void main(String[] args) {
        Figure b = new Circle();
        Cilynder a = new Cilynder(b);
        a.calcArea();
    }
}