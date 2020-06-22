package com.example.facade;

public class NonVegBothRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        Both both=new Both();
        return both;
    }
}
