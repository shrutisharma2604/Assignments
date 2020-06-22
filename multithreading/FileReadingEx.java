package com.example.multithreading;

public class FileReadingEx {
    public static void main(String[] args) {
       FileRead fileRead=new FileRead();
       file1 file1=new file1(20,fileRead);
       file1.setName("file1");
       file2 file2=new file2(20,fileRead);
       file2.setName("file2");
       file1.start();
       file2.start();
    }
}
