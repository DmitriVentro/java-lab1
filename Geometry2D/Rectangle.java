package Geometry2D;

import java.util.Scanner;

public class Rectangle implements Figure {
    private Double a, b, area;
    Scanner scanner = new Scanner(System.in);

    public Rectangle() {
        System.out.println("Введите стороны прямоугольника:\n");
        while (a < 0 || b < 0) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
        }
    }

    @Override
    public Double calcArea() {
        area = a * b;
        return area;
    }

    @Override
    public void showInformation() {
        System.out.println("Стороны прямоугольника: " + a + ' ' + b + '\n' + "Площадь: " + area);
    }

}
