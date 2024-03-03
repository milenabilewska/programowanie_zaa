package com.example.serializacja;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("D://Programy/Projekty/programowanie_zaawansowane/src/main/java/com/example/serializacja/person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person person = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data: " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
