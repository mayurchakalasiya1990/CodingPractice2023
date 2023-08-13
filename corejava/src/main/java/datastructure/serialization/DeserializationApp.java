package datastructure.serialization;

import java.io.*;

public class DeserializationApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream stream=new FileInputStream(new File("./byteStream.txt"));
        ObjectInputStream inputStream=new ObjectInputStream(stream);
        Employee employee=(Employee)inputStream.readObject();
        inputStream.close();
        stream.close();
        System.out.println(employee);
    }
}
