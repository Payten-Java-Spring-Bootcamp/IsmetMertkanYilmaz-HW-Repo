package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Slice {

    public static void main(String[] args) {

        List<String> liste1 = Arrays.asList("1","2","3","4","5");
        int n = 1;
        int t = 3;

        List<String> listeDrop = liste1.stream().filter(s -> n<=liste1.indexOf(s) & liste1.indexOf(s)<=t).collect(Collectors.toList());

        System.out.println(listeDrop);

    }

}
