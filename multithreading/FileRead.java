package com.example.multithreading;

public class FileRead {
    boolean isFile1Read = false;
    synchronized void readFile1(int number){
        while (isFile1Read){
           try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isFile1Read=true;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }

     synchronized void readFile2(int number){
        while (! isFile1Read){

         try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isFile1Read=false;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }
}
