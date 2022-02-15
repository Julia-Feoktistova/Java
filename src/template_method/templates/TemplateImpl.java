package template_method.templates;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class TemplateImpl extends Template{

    Scanner scanner = new Scanner(System.in);
    String fileName;

    @Override
    protected void enterFileName() {
        System.out.println("File name:");
        fileName = scanner.next();
        File file = new File(fileName + ".txt");
    }

    @Override
    protected void chooseRewriteOrAdd() {
        System.out.println("Choose 1 if want to rewrite file or 2 for adding new info");
        int choose = scanner.nextInt();

        if (choose == 1) {
           rewriteText();
        } else if (choose == 2) {
            addText();
        } else {
            System.out.println("choose 1 or 2");
        }
    }

    @Override
    protected void addDataTime() {
        try {
            FileWriter writer = new FileWriter(fileName+".txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            Date date = new Date();
            bufferWriter.write((date)+ "\n");
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected void rewriteText() {
        System.out.println("Write text");
        String text = scanner.next();
        try(FileWriter writer = new FileWriter( fileName+ ".txt")){
            writer.append(text + "\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void addText() {
        System.out.println("Write text");
        String text = scanner.next();

        try {
            FileWriter writer = new FileWriter(fileName+".txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text + "\n");
            bufferWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void writeFile() {
        System.out.println("Файл " + fileName + " записан");
    }
}
