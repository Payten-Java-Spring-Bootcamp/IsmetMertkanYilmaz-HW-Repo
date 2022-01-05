package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello");
        list.add("Word");

        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(o -> o.length()));

        System.out.println(collect);


    }

}
