package Geometry2D;

import java.util.Scanner;

public class Triange implements Figure {
    private Double a, b, c, area;
    Scanner scanner = new Scanner(System.in);

    public Triange() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
        while (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("Введите данные треугольника, соответствующие условиям");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }
    }

    @Override
    public void calcArea() {
        area = Math
                .sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    @Override
    public void showInformation() {
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
