package com.example.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper=new HotelKeeper();
        VegMenu v=hotelKeeper.getVegMenu();
        NonVegMenu nv=hotelKeeper.getNonVegMenu();
        Both both=hotelKeeper.getBothMenu();
    }
}
