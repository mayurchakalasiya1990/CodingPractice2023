package org.example.serialization;

import org.example.coreconcepts.clone.EmployeeDeepCloning;

import java.io.*;

public class SerializationApp {
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee("Mayur",15, 20000);
        FileOutputStream stream=new FileOutputStream(new File("./byteStream.txt"));
        try(stream){
            ObjectOutputStream outputStream=new ObjectOutputStream(stream);
            outputStream.writeObject(employee);
            outputStream.close();
        }
        System.out.println("Object is Serialize:"+employee);

    }
}

