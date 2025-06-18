package com.myjava.practice.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("ABC.txt");
        fileWriter.write("This is my first file from Java");
        fileWriter.close();
//        FileReader reader = new FileReader("ABC.txt");
//        char[] str =  new char[31];
//        System.out.println(reader.read(str));
//        System.out.println(str);

    }
}
