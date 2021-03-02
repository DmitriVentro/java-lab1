package Geometry3D;
import Geometry2D.*;
public class Cilynder {
    Figure F;
    Double h;
    public String figureName = "Цилиндр";
    public Cilynder(Figure myFigure, Double height) {
        F = myFigure;
        h = height;
    }

    public Double volume() {
        return F.calcArea() * h;
    }

    public void showInformation() {
        System.out.println("\n" + F.getName() + "\nПлощадь:\n" + this.volume() + "\n");
    }
}
