package Geometry2D;
import java.util.Scanner;

public class Circle implements Figure{
    Scanner scanner = new Scanner(System.in);
    private Double r;
    public Circle() {
        System.out.println("Введите радиус:\n");
        r = scanner.nextDouble();
    }
    @Override
    public void calcArea() {
    }
    @Override
    public void showInformation() {
        System.out.println("Информация по шару: " + r);
    }
    
}
