package State.fileTypes;
import java.util.Scanner;

public class Address implements State.Address {
    Scanner sc = new Scanner(System.in);
    String disk;
    String absoluteFilePath;

    @Override
    public String enterAddress() {
        System.out.println("Please, enter path to file");
        disk = sc.next();
        return disk;
    }

    public String Address(String disk){
        String fileSeparator = System.getProperty("file.separator");
        //создаем абсолютный путь к файлу
        absoluteFilePath = fileSeparator + disk + fileSeparator + "file.txt";
        return absoluteFilePath;
    }

}
