

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(FileSingleton.getFile());
        ArrManager arr1 = new ArrManager();
        ArrManager arr2 = arr1.copy();
        System.out.println(arr2.toString());
    }
}
