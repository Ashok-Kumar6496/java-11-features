package java8.classes;

import java8.interfaces.SampleInterface;

import java.util.ArrayList;
import java.util.List;

public class LamdaClass {

    public static void main(String... a) {
        //To instantiate the function interface abstract method we can use lambda below like based on number of params
        SampleInterface sampleInterface = (numberA, numberB) -> numberA + numberB + 3;
        System.out.println("Sample Lambda expression with Functional Interface : " + sampleInterface.add(3, 4));
        useLambdaForCollections();
    }

    private static void useLambdaForCollections() {
        //We can use lambda expressions for iterating over collections using forEach statement.
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(23);
        integers.add(34);
        integers.add(12);
        System.out.println(integers.stream().filter(number -> number == 34).count());
        integers.forEach(number -> System.out.println(number + 1));
    }
}

