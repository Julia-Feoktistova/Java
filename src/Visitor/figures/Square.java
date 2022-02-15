package Visitor.figures;

import Visitor.figures.Figure;

import java.io.Serializable;

public class Square extends Figure implements Serializable {
    private int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }
}
