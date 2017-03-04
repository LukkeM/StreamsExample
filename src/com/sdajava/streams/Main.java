package com.sdajava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Przyklad1
        List<String> words =
                Arrays.asList("ab", "hej", "czesc", "hello");

        words.forEach(s -> System.out.println("Slowo: " + s));
        words.forEach(System.out::println);

        System.out.println("=======");

        //Przyklad 2
        System.out.println("Przyklad 2");
        List<String> modWords =
                words.stream().map(s -> s + "!").collect(Collectors.toList());
        modWords.forEach(System.out::println);

        //words.stream().forEach(s -> s.replace(x -> s + "!"));

        //Przyklad 3

        List<String> replaceWords = words.stream()
                                         .map(s -> s.replace("e", "stodola"))
                                         .collect(Collectors.toList());
        replaceWords.forEach(System.out::println);

        //Przyklad 4

        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);


        //Przyklad 5

        List<String> shortWords = words.stream()
                                       .filter(s -> s.length() < 4)
                                       .collect(Collectors.toList());

        shortWords.forEach(System.out::println);

        //Przyklad 6

        List<String> wordsWithC = words.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .filter(s -> s.contains("c"))
                                        .collect(Collectors.toList());
        wordsWithC.forEach(System.out::println);

        // Przyklad 7


        List<String> evenLengthWords = words.stream()
                                            .filter(s -> (s.length() % 2) == 0)
                                            .collect(Collectors.toList());
        evenLengthWords.forEach(System.out::println);







    }
}
