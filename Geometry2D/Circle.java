package Geometry2D;

public class Circle implements Figure {
    private Double r;
    public String figureName = "Круг";

    public Circle(Double radius) {
        r = radius;
    }

    @Override
    public Double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public void showInformation() {
        System.out.println("\n" + figureName + "\nИнформация по шару: " + r + "\n" + "Площадь: " + this.calcArea());
    }
    @Override
    public String getName() {
        return figureName;
    }

}
