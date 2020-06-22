package com.example.multithreading;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {
    public void show() {
        try {
            FileReader fileReader=new FileReader("/home/shruti/Documents/file1.txt");
            Scanner scanner=new Scanner(fileReader);
         while (scanner.hasNextLine()){
             String data=scanner.nextLine();
             System.out.println(data);
         }
         scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
