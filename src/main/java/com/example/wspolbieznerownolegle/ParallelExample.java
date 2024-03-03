package com.example.wspolbieznerownolegle;

import java.util.Arrays;

public class ParallelExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(numbers)
                .parallel()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sum();

        System.out.println(sum);
    }
}
