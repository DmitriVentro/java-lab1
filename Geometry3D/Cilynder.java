package Geometry3D;
import Geometry2D.*;
public class Cilynder implements Figure {
    Figure F;
    Double h;
    public String figureName = "Цилиндр";
    public Cilynder(Figure myFigure, Double height) {
        F = myFigure;
        h = height;
    }

    public Double calcArea() {
        return F.calcArea() * h;
    }

    public void showInformation() {
        System.out.println("\n" + figureName + "\nПлощадь:\n" + this.calcArea() + "\n");
    }
}
