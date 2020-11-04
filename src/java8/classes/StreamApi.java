package java8.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {


    public static void main(String... s) {
        List<POJO> pojos = Arrays.asList(new POJO("Ashok", 1), new POJO("Pri", 2), new POJO("Lambu", 3));
        List<POJO> pojos1 = Arrays.asList(new POJO("Lambu", 1), new POJO("Ashok", 2), new POJO("Pri", 3));
        List<String> strings = Arrays.asList("Ashok", "Pri", "Lambu");
        List<String> integers = Arrays.asList("1", "2", "3");
        Stream<POJO> stringStream = Stream.concat(pojos.stream(), pojos1.stream());
        stringStream.forEach(pojo -> {
            System.out.println(pojo.getId());
            System.out.println(pojo.getName());
        });
    }
}
