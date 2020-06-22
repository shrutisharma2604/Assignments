package com.example.practice;

import java.util.logging.Level;
import java.util.logging.Logger;

class B extends Thread{
    private static final Logger LOGGER=Logger.getLogger(NotifyExample.class.getName());
    A a;
    B(A a){
        this.a=a;
    }
    public void run(){
        synchronized (this.a){
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> starts");
            try {
                this.a.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> notified");
        }
    }
}