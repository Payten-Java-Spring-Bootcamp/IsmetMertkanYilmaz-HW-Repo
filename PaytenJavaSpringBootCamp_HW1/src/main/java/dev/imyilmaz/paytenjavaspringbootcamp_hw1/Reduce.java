package dev.imyilmaz.paytenjavaspringbootcamp_hw1;

import java.util.Arrays;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        String[] array = { "A1", "B1", "C1" };

        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + str2);

        System.out.println(String_combine.get());

    }

}
