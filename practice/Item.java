package com.example.practice;

public class Item extends Thread{
    int i;
    boolean isProduced=false;
    public synchronized void Produce(int x){
        if (isProduced){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        i=x;
        isProduced=true;
        notify();
    }

    public synchronized void Consume(int x){
        if (!isProduced){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        i=x;
        isProduced=false;
        notify();
    }
}
