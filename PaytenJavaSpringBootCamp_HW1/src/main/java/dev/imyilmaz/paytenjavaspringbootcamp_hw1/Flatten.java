package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("A1", "A2", "A3", "A4");
        List<String> list2 = Arrays.asList("B1", "B2", "B3");
        List<String> list3 = Arrays.asList("C1", "C2");
        List<String> list4 = Arrays.asList("D1");

        List<List<String>> products = new ArrayList<List<String>>();

        products.add(list1);
        products.add(list2);
        products.add(list3);
        products.add(list4);

        List<String> flatMapList = products.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());

        System.out.println(flatMapList);

    }

}
