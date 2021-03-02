package Geometry2D;
/**
 * Triangle
 */
public class Triangle implements Figure {
    private Double a, b, c;

    public String figureName = "Треугольник";

    public Triangle(Double... sides) {
        a = sides[0];
        b = sides[1];
        c = sides[2];
    }

    @Override
    public Double calcArea() {
        return Math
                .sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    @Override
    public void showInformation() {
        System.out.println(figureName);
        System.out.println("\n" + figureName + "\nСтороны:\n" + a.intValue() + "\n" + b.intValue() + "\n" + c.intValue()
                + "\n" + "Площадь: " + (this.calcArea()).intValue());
    }
    @Override
    public String getName() {
        return figureName;
    }
}
