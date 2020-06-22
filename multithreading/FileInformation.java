package com.example.multithreading;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File obj=new File("/home/shruti/Documents/file1.txt");
        if (obj.exists()){
            System.out.printf("Readable =" + obj.canRead());
            System.out.println("Writable =" + obj.canWrite());
        }
        else {
            System.out.println("file doesn't exist");
        }
    }

}
