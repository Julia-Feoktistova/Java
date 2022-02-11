package proxy;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Proxy proxy = new Proxy();
        File file = new File("test2.txt");

        proxy.write(file);
        proxy.count(file);
        System.out.println(proxy.read(file));
        System.out.println(proxy.countS(file));

        Logging log = new Logging();
        log.writeLog(file);
        System.out.println(log.readLog(file));
    }
}
