package com.example.facade;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        NonVegMenu nonVegMenu=new NonVegMenu();
        return nonVegMenu;
    }
}
