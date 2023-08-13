package datastructure.java9;

import java.io.*;
import java.nio.file.Path;

public class TryResourceExample {
    public static void main(String[] args) throws IOException {
        String path="./tmp/mayur.text";
        FileReader fileReader=new FileReader(path);
        //try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
        try(fileReader){
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println(br.readLine());
        }
    }
}
