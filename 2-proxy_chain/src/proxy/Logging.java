package proxy;

import java.io.*;
import java.util.logging.Logger;

public class Logging extends Proxy {

    AddString addString = new AddString();

    public void writeLog(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(String.valueOf(addString));
        } catch (Exception e) {
            throw e;
        }
    }

    public String readLog(File loggingFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(loggingFile))) {
            String str = br.lines().reduce((s, s2) -> s + "\n" + s2).get();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
