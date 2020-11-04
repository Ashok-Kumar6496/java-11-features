package java8.interfaces;

public interface Interface1 {
    String variable = "Hi hello world";

    //abstract method which need to be implemented
    int add(int a, int b);

    default void defaultMethod() {
        System.out.println("Method called from default method" + variable);
    }

    static void staticMethod() {
        System.out.println("Method called from static method" + variable);
    }

    private void privateMethod() {

    }
}
