package Visitor;

import Visitor.figures.Circle;
import Visitor.figures.Square;

import java.io.*;

public class SerialisationVisitor implements Visitor{

    @Override
    public void saveCircle(File file, Circle circle) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(file))) {
            os.writeObject(circle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveSquare(File file, Square square) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(file))) {
            os.writeObject(square);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getCircle(File fileCircle) throws IOException, ClassNotFoundException {
        Object circle;
        try (FileInputStream fis = new FileInputStream(fileCircle);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            circle = ois.readObject();
        }
        return circle;
    }

    public Object getSquare(File fileSquare) throws IOException, ClassNotFoundException {
        Object square;
        try (FileInputStream fis = new FileInputStream(fileSquare);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            square = ois.readObject();
        }
        return square;
    }
}

