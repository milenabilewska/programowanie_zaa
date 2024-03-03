package com.example.funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        Predicate<String> startsWithC = s -> s.startsWith("C");
        List<String> cNames = filter(names, startsWithC);
        System.out.println(cNames);

        Function<String, String> addPrefix = s -> "Mr. " + s;
        List<String> prefixedNames = map(names, addPrefix);
        System.out.println(prefixedNames);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).toList();
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        return list.stream().map(function).toList();
    }
}
