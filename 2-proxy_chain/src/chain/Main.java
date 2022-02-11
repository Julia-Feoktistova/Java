package chain;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TextValidExeption {
        Testing t = new Testing("aa");
        ArrayList<Handler> handlers = new ArrayList<Handler>();

        handlers.add(t);

        Handler handler = test1 -> t.getText()!= null;
        handler.andThen(test2 -> t.getText()!= "0");
        t.invoke("jj");
        //t.invoke("0"); //Exeption
        System.out.println(handler);
        System.out.println(handlers);

    }
}
