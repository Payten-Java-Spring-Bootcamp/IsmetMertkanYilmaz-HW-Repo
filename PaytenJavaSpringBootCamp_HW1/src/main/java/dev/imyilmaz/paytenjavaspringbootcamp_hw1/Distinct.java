package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        List<String> distinctElements = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctElements);

    }

}
