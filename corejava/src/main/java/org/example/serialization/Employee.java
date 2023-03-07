package org.example.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Data
@ToString
public class Employee implements Serializable {
    private String name;
    private int age;
    private transient double salary;


}
