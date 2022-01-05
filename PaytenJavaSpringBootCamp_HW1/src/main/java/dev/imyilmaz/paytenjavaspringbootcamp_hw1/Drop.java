package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drop {

    public static void main(String[] args) {

        List<String> liste1 = Arrays.asList("1","2","3","4");
        int n = 1;

        List<String> listeDrop = liste1.stream().filter(s -> n<=liste1.indexOf(s)).collect(Collectors.toList());

        System.out.println(listeDrop);

    }

}
