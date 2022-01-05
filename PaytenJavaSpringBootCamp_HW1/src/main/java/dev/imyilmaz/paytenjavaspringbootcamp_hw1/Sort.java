package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {

        List<String> liste1 = Arrays.asList("ali", "ayse", "mert", "merve");

        List<String> listeFinal = liste1.stream().filter(s -> s.contains("e")).sorted(Comparator.comparing(s -> s.length())).collect(Collectors.toList());

        System.out.print(listeFinal);

    }

}
