package com.example.multithreading;


import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myfile=new File("/home/shruti/Documents/file1.txt");
            File myfile1=new File("/home/shruti/Documents/file2.txt");
            if(myfile.createNewFile()){
                System.out.println("File created" + myfile.getName());
            }
            else {
                System.out.printf("file already exist");
            }
            if(myfile1.createNewFile()){
                System.out.println("File created" + myfile1.getName());
            }
            else {
                System.out.printf("file already exist");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
