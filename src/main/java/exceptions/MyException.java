package exceptions;

public class MyException extends Exception {
    public MyException() {
        this("default message for  my exception");
    }

    public MyException(String message) {
        super(message);
    }
}