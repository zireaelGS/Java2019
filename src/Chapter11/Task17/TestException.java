package Chapter11.Task17;

import java.io.IOException;

//In your program, create try blocks that throw exceptions of types
//        ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should be
//        caught with catch blocks specifying type Exception.
public class TestException {

    public static void main(String[] args) {

        try {
            throw new ExceptionA("This is exception A");
        } catch (Exception a) {
            a.printStackTrace();
        }

        try {
            throw new ExceptionB("This is exception B");
        } catch (Exception b) {
            b.printStackTrace();
        }

        try {
            throw new NullPointerException();
        } catch (Exception nPe) {
            nPe.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (Exception iOe) {
            iOe.printStackTrace();
        }
    }
}
