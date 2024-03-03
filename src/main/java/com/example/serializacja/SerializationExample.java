package com.example.serializacja;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        try {
            FileOutputStream fileOut = new FileOutputStream("D://Programy/Projekty/programowanie_zaawansowane/src/main/java/com/example/serializacja/person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
