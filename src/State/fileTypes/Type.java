package State.fileTypes;
import State.Object;
import State.TextType;
import State.WritingFile;

import java.io.IOException;
import java.util.Scanner;

public class Type implements TextType {
    Scanner sc = new Scanner(System.in);
    WritingFile writingFile = new WritingFile();
    Object object = new Object("Basic");
    Address address = new Address();

    @Override
    public void chooseFormat()  {
        System.out.println("Please, enter 1 if want to save in JSON or 2 if in simple text");
        int type = sc.nextInt();
        if (type == 1) {
            try {
                writingFile.writeJSON();
                writingFile.saveObj(object);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (type == 2) {
            writingFile.writeText();
            writingFile.saveObj(object);
        } else {
            System.out.println("JSON or TEXT? Enter 1 or 2");
        }
    }
}
