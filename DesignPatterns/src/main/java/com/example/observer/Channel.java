package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs=new ArrayList<>();
    private String title;

    public void  subscriber(Subscriber sub){
        subs.add(sub);
    }

    public void  unSubscriber(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscriber(){
        for (Subscriber sub : subs){
            sub.update();
        }
    }
}
