package proxy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddString extends ConsoleInput{
StringCounter counter = new StringCounter();
    public void write(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            String s = sc.next();
            bw.write(s + " " + date + "\n");
            counter.countStrings(file);
        } catch (Exception e) {
            throw e;
        }
    }
}
