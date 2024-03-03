package com.example.serializacja;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person implements Serializable {

    private static final long serialVersionUID = 1l;
    private String name;
    private int age;

}
