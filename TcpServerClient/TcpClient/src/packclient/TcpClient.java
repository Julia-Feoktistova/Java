package packclient;

import javax.swing.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(new File ("C:/1/test/testTcp.txt")));

        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6666);
        OutputStream outputStream = socket.getOutputStream();

        int length = -1;
        byte[] buf = new byte[1024 * 8];

        while ((length = bis.read(buf)) != -1) {
            outputStream.write(buf, 0, length);

        }
        System.out.println("file send");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter command /fs to print file names in server's directory");
        String line = sc.nextLine();

        if (line.equals("/fs")) {
            System.out.println(Files.walk(Paths.get("C:/1/test/"))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList()));
        } else {
            System.out.println("try to input /fs");
        }
        socket.close();
        bis.close();
    }
}
