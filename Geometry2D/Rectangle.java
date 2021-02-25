package Geometry2D;

public class Rectangle implements Figure {
    private Double a, b;
    public String figureName = "Прямоугольник";

    public Rectangle(Double...sides) {
        a = sides[0];
        a = sides[1];
    }

    @Override
    public Double calcArea() {
        return a * b;
    }

    @Override
    public void showInformation() {
        System.out.println(figureName);
        System.out.println("Стороны прямоугольника: " + a + ' ' + b + '\n' + "Площадь: " + this.calcArea());
    }

}
