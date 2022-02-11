package proxy;

import java.io.File;
import java.io.IOException;

public class Proxy {

    StringCounter reader = new StringCounter();

    public String read(File file) {
        try {
            return reader.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void write(File file) {
        try {
            AddString writer = new AddString();
            writer.write(file);
            count(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void count(File file) throws IOException {
        if (reader.countStrings(file) >= 3) {
            file.createNewFile();
        }
    }

    public int countS(File file) {
       return reader.countStrings(file);
    }
}
