package State;

import java.io.Serializable;

public class Object implements Serializable {
    private String name;

    public Object() {

    }

    public String getName() {
        return name;
    }

    public Object(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                '}';
    }
}
