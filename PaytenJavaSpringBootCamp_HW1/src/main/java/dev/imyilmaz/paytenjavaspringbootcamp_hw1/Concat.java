package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {

        List<String> productlist1 = Arrays.asList("A1", "A2", "A3", "A4");
        List<String>  productlist2 = Arrays.asList("B1", "B2", "B3");

        /*
        List<String> flatMapList = Stream.of(productlist1,productlist2).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatMapList);
        */

        List<String> list = Stream.concat(productlist1.stream(), productlist2.stream()).collect(Collectors.toList());

        System.out.println(list);


    }

}
