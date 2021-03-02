package Geometry2D;

public class Rectangle implements Figure {
    private Double a, b;

    public String figureName = "Прямоугольник";

    public Rectangle(Double... sides) {
        a = sides[0];
        b = sides[1];
    }

    @Override
    public Double calcArea() {
        return a * b;
    }

    @Override
    public void showInformation() {
        System.out.println(
                "\n" + figureName + "\nСтороны прямоугольника: " + a + '\n' + b + '\n' + "Площадь: " + this.calcArea());
    }

    @Override
    public String getName() {
        return figureName;
    }
}
