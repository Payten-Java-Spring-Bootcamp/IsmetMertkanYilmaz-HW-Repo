package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Difference {

    public static void main(String[] args) {

        List<String> liste1 = Arrays.asList("1","2","3","4");
        List<String> liste2 = Arrays.asList("1","2");


        List<String> differences = liste1.stream()
                .filter(element -> !liste2.contains(element))
                .collect(Collectors.toList());

        System.out.println(differences);

    }

}
