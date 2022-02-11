package proxy;

import java.io.*;

public class StringCounter {

    public String read(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String str = br.lines().reduce((s, s2) -> s + "\n" + s2).get();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public int countStrings(File file){
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            while (br.readLine() != null) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
