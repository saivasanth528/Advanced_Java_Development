package Generics;

public class GenericExample {
    public static void main(String args[]) {
        // diamond operator
        Tuple<Integer, String> tuple = new Tuple<>(3, "hai");
        System.out.println(tuple);
    }
}
