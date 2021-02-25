package Geometry3D;
import java.util.Scanner;
import Geometry2D.*;
public class Cilynder {
    Figure F;
    Double h, area;
    Scanner scanner = new Scanner(System.in);
    public Cilynder(Figure myFigure) {
        F = myFigure;
        while (h < 0) {
        System.out.println("Введите высоту (значение больше нуля)");
        h = scanner.nextDouble(); 
        }
    }

    public Double calcArea() {
        area = F.calcArea() * h;
        return area;
    }

    public void showInformation() {
        System.out.println(area);

    }
}
