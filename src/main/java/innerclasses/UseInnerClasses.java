package innerclasses;

public class UseInnerClasses {
    public static void main(String[] args) {
        new OuterClass().new Inner().myMethod();
        new OuterClass.InnerStatic().myMethod();
    }



}
