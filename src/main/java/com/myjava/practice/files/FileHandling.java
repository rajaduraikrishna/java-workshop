package com.myjava.practice.files;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File myFile = new File("src");
        System.out.println(myFile.isFile());
        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.getCanonicalFile());
        System.out.println(myFile.getParentFile());
        System.out.println(myFile.canExecute());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.getName());
        System.out.println(myFile.getPath());
        System.out.println(myFile.isDirectory());
        System.out.println(myFile.isHidden());
        System.out.println(myFile.lastModified());
        System.out.println(myFile.length());
        if(myFile.isDirectory()) {
            for(String file: myFile.list()) {
                System.out.println(file);
            }
        }
    }
}
