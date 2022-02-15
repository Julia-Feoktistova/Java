package Visitor.figures;

import java.io.Serializable;

public class Circle extends Figure implements Serializable {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
