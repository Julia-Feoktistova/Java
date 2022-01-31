

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSingleton {

    private static FileSingleton fileSingleton;
    private FileSingleton(){
    }

    public static FileSingleton getFile() {
        try {
            if(fileSingleton == null) {
                FileWriter writer = new FileWriter("notes3.txt");

                String text = "Hello!";
                writer.write(text);

                writer.flush();

                FileReader reader = new FileReader("notes3.txt");
                int c;
                while((c=reader.read())!=-1) {

                    System.out.print((char) c);
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return fileSingleton;
    }
}
