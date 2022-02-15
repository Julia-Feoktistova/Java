package State;

import State.fileTypes.Address;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WritingFile {
    Address address = new Address();

    public void writeJSON() throws IOException {
        Object object = new Object();
        File file = new File(address.enterAddress());
        if (file.createNewFile()) {
            Gson g = new GsonBuilder().setPrettyPrinting().create();//запись gson с отступами
            String json = g.toJson(object);
            Files.write(Paths.get("file.json"), json.getBytes());
            String s = new String(Files.readAllBytes(Paths.get("file.json")));
            Object object1 = g.fromJson(s, Object.class);
            System.out.println(object1);
            System.out.println("Файл создан");
        }
    }

    public void writeText() {
        File file = new File(address.enterAddress());
        try {
            if (file.createNewFile()) {
                System.out.println(file + " Файл создан");
            } else {
                System.out.println("Файл " + file + " уже существует");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveObj(Object object) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(address.Address(address.enterAddress())))) {
            os.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
