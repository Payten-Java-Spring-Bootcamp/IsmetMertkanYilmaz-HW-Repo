package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Union {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(2,3,4));

        Set<Integer> union = Stream.of(a, b)
                .flatMap(x -> x.stream())
                .collect(Collectors.toSet());

        List<Integer> c = union.stream().collect(Collectors.toList());
        System.out.println(c);

    }

}
