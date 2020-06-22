package com.example.practice;

public class NotifyExample {
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        B b=new B(a);
        C c=new C(a);
        Thread t1=new Thread(a,"Thread-1");
        Thread t2=new Thread(b,"Thread-2");
        Thread t3=new Thread(c,"Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}
