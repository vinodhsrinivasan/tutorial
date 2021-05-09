package main.java;

import java.util.Arrays;
import java.util.List;

public class CollectorEx {
    // Lamda Expression
    // Functional Interface
    // Default methods
    //Streams
    //Method Reference
    //Optional
    //Collector class
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int num = numbers.stream().
                filter(e-> e >3).
                filter(e -> e%2==0)
                .map(e -> e*3)
                .findFirst()
                .get();
        System.out.println(num);
    }
}
