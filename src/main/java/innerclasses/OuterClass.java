package innerclasses;

public class OuterClass {
    private  int a;
    private String test;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public class Inner {
        public void myMethod() {
            System.out.println("a = " + a + ", String test = " + test);
        }
    }

    public static class InnerStatic {
        public void myMethod() {
            System.out.println("Inside a static inner class");
        }
    }
}
