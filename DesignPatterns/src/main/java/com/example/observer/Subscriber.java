package com.example.observer;

public class Subscriber {
    private String name;
    private Channel channel;
    public void update(){
        System.out.println("Video uploaded");
    }
    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
