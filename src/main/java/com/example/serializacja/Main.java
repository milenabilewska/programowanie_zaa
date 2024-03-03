package com.example.serializacja;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("Anna Kowalska", 25);

        //zapisanie obiektu di pliku tekstowego
        String filename = "D://Programy/Projekty/programowanie_zaawansowane/src/main/java/com/example/serializacja/person.txt";
        savePersonToFile (person,filename);
        System.out.println("Dane zostały zapisane do pliku");

        //Odczytywanie danych z pliku tekstowego

             Person  loadPerson = loadPersonFromFile(filename);
        System.out.println("Dane zostały odczytane : " + loadPerson);
    }

    private static Person loadPersonFromFile(String filename) {
        Person person = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Odczytywanie danych z pliku tekstowego
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            person = new Person(name, age);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }


    private static void savePersonToFile(Person person, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            //zapisywanie w formej tekstowej
              writer.println(person.getName());
               writer.println(person.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



        }
