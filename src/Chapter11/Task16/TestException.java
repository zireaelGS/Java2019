package Chapter11.Task16;

public class TestException {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("This is exception B");
        } catch (ExceptionA e) {
            e.printStackTrace();
        }
        try {
            throw new ExceptionC("This  is exception C");
        } catch (ExceptionA e) {
            e.printStackTrace();
        }
    }
}
