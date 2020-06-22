package com.example.practice;

import java.util.logging.Level;
import java.util.logging.Logger;

class C extends Thread{
    private static final Logger LOGGER=Logger.getLogger(NotifyExample.class.getName());
    A a;
    C(A a){
        this.a=a;
    }
    public void run(){
        synchronized (this.a){
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> starts");
            this.a.notifyAll();
            LOGGER.log(Level.SEVERE,Thread.currentThread().getName() + ">>>>> notified");
        }
    }
}
