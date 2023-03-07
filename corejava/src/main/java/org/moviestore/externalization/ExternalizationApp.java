package org.example.externalization;

import org.example.externalization.Student;

import java.io.*;

public class ExternalizationApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student();
        student.setStudentName("Lisa");
        student.setStudentId(1);
        student.setAge(15);
        student.setDeptId(10);
        student.setDeptName("IT");


        FileOutputStream streamOut=new FileOutputStream(new File("./StudentDetails.txt"));
        try(streamOut){
            ObjectOutputStream outputStream=new ObjectOutputStream(streamOut);
            outputStream.writeObject(student);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Object is Serialize:"+student);

        FileInputStream streamIn=new FileInputStream(new File("./StudentDetails.txt"));
        ObjectInputStream inputStream=new ObjectInputStream(streamIn);
        Student studentDez=(Student)inputStream.readObject();
        inputStream.close();
        streamIn.close();
        System.out.println(studentDez);
    }
}
