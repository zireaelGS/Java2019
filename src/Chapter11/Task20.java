package Chapter11;

public class Task20 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception m) {
            System.err.println("Exception handled in main");
            m.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.err.println("someMethod have called someMethod2, caught the exception and rethrowed it");
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        System.err.println("someMethod2 throw Exception");
        throw new Exception();
    }
}
