package rethrows;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.err.println();
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("caught exception in main with message:\""+ e.getMessage()+"\"");
            e.printStackTrace();
        }
    }
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        }catch (Exception e){
            System.out.println("caught exception in someMethod with message:\"" + e.getMessage() + "\"and rethrow it");
            e.printStackTrace();
            throw e;
        }
    }
    public static void someMethod2() throws Exception {
        throw new Exception("exception thrown from someMethod2");
    }
}
