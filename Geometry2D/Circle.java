package Geometry2D;

public class Circle implements Figure {
    private Double r, area;

    public Circle(Double radius) {
        r = radius;
    }

    @Override
    public Double calcArea() {
        area = Math.PI * r * r;
        return area;
    }

    @Override
    public void showInformation() {
        System.out.println("Информация по шару: " + r + "\n" + "Площадь: " + area);
    }

}
