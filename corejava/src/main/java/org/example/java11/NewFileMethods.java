package org.example.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile("java",".txt"),"Sample text");
        System.out.println(filePath);
        String s = Files.readString(filePath);
        System.out.println(s);
    }
}
