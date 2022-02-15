package Visitor;

import Visitor.figures.Circle;
import Visitor.figures.Square;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileCircle = new File("circle.txt");
        File fileSquare = new File("square.txt");
        Circle circle = new Circle(5);
        Square square = new Square(12);
        SerialisationVisitor sv = new SerialisationVisitor();
        sv.saveCircle(fileCircle, circle);
        sv.saveSquare(fileSquare, square);
        System.out.println(sv.getCircle(fileCircle));
        System.out.println(sv.getSquare(fileSquare));
    }
}
