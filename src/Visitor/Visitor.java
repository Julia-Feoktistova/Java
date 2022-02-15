package Visitor;

import Visitor.figures.Circle;
import Visitor.figures.Square;

import java.io.File;

public interface Visitor {
    void saveCircle(File file, Circle circle);
    void saveSquare(File file, Square square);
}
