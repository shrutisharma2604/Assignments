package com.example.builder;

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOS("Android").setRam(2).getPhone();
        System.out.println(p);
    }
}
