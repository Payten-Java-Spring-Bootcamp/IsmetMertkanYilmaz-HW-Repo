package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Select {

    public static void main(String[] args) {

        List<String> liste1 = Arrays.asList("ali","ayse","mert","merve");

        List<String> listeFinal = liste1.stream().filter(s -> s.contains("e")).collect(Collectors.toList());

        System.out.print(listeFinal);

    }

}
