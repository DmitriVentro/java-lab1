/**
 * Test
 */
import Geometry2D.*;
import Geometry3D.*;
public class Test {

    public static void main(String[] args) {
        // Figure b = new Circle();
        // Cilynder a = new Cilynder(b);
        Figure b = new Triange(3.0, 4.0, 5.0);
        b.showInformation();
        Cilynder c = new Cilynder(b, 10.5);
        System.out.println(c.calcArea());
    }
}