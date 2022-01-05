package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = list1.stream().map(s -> s*3).collect(Collectors.toList());

        System.out.println(list2);

    }

}
