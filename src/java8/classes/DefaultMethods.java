package java8.classes;

import java8.interfaces.Interface1;

public class DefaultMethods implements Interface1 {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String... w) {
        DefaultMethods defaultMethods = new DefaultMethods();
        System.out.println(defaultMethods.add(2, 3));
        defaultMethods.defaultMethod();
        Interface1.staticMethod();
    }
}
