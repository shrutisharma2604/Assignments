package com.example.facade;

public class HotelKeeper {
    public VegMenu getVegMenu(){
        VegRestaurant v=new VegRestaurant();
        VegMenu vegMenu=(VegMenu)v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nv=new NonVegRestaurant();
        NonVegMenu nonVegMenu=(NonVegMenu)nv.getMenus();
        return nonVegMenu;
    }

    public Both getBothMenu(){
        NonVegBothRestaurant b=new NonVegBothRestaurant();
        Both vegMenu=(Both)b.getMenus();
        return vegMenu;
    }
}
