package com.example.practice;

import java.util.logging.Level;
import java.util.logging.Logger;

class A extends Thread{
    private static final Logger LOGGER=Logger.getLogger(NotifyExample.class.getName());
    public void run(){
        synchronized (this){
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> starts");
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> notified");
        }
    }
}
