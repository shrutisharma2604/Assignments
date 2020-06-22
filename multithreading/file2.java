package com.example.multithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class file2 extends Thread{
    int limit;
    FileRead fileRead;
    public file2(int limit,FileRead fileRead){
        this.limit=limit;
        this.fileRead=fileRead;
    }
    @Override
    public void run() {
        int count=11;
        try {
            FileReader fileReader = new FileReader("/home/shruti/Documents/file2.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        while (count<=limit) {
            fileRead.readFile2(count);
            count=count + 1;
        }
    }
}
