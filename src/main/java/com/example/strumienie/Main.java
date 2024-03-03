package com.example.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Tworzymy liste liczb
        List<Integer> liczby = Arrays.asList(1,2,3,4,5,6,7);

        // filtrowanie parztstych liczb  i podniesienie do kwadratu
        liczby.stream()
                .filter(n -> n % 2 == 0) // filtrujemy parzyste liczby
                .map( n-> n * n) // podnosimy do kwadraty
                .forEach(System.out::println);


        int suma =  liczby.stream()
                .filter(n -> n>5) // filtrowanie wieksze od 5
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println( "Suma licz wieksza niż 5:  " + suma);


        List<Double> lista2 = liczby.stream()
                .map(Integer::doubleValue)
                .toList();
        System.out.println(lista2);

        lista2.stream()
                .map(n -> n + 0.33)
                .map(n -> n * n)
                .forEach(System.out::println);


        List <String> slowa = Arrays.asList("Jeden", "Dwa", "Trzy", "Cztery" );

        slowa.stream()
                .filter( x -> x.length() > 4)
                .forEach(System.out::println);



long iloSlowDluzszacztery = slowa.stream()
        .filter( y -> y.length() > 4)
        .count();

        System.out.println( "Ilosc slow dluzsza niz cztery "  + iloSlowDluzszacztery);

        System.out.println( "Sotrowanie alfabetyczne");
        slowa.stream()
        .sorted()
        .forEach(System.out::println);


        List <String> slowa1 = Arrays.asList("Jeden", "Dwa", "Trzy", "Cztery" );

        Map<Integer, List<String>> grupowaneWedlugDlugosci = slowa1.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grupowaneWedlugDlugosci);



    }



}
