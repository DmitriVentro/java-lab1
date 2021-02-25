package Geometry3D;
import java.util.Scanner;
import Geometry2D.*;
public class Cilynder {
    Figure F;
    Double h;
    Scanner scanner = new Scanner(System.in);
    public Cilynder(Figure myFigure, Double height) {
        F = myFigure;
        h = height;
    }

    public Double calcArea() {
        return F.calcArea() * h;
    }

    public void showInformation() {
        System.out.println("Позже допишу");
    }
}
