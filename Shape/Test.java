package Shape;

import java.util.Scanner;
import Geometry2D.*;
import Geometry3D.*;

public class Test {
    public static void main(String...strings) {
        Scanner scanner = new Scanner(System.in);
        Integer choice;
        System.out.println("Выберите геометрическую фигуру:\n1. Круг\n2. Треугольник\n3. Прямоугольник");
        Figure F = null;
        Boolean boolChoice = true;
        while (boolChoice) {
            choice = scanner.nextInt();
            if (choice == 1) {
                F = new Circle(10.0);
            } else if (choice == 2) {
                F = new Rectangle(3.0, 5.0);
            } else if (choice == 3) {
                F = new Triangle(3.0, 4.0, 5.0); 
            } else if (choice == 0){
                boolChoice = false;
                scanner.close();
                return;
            }
            Cilynder c = new Cilynder(F, 10.5);
            c.showInformation();
        }
        scanner.close();
    }
}