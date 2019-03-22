package com.gandan.android.androiddesignpattern.observer;

import android.util.Log;

public class EventSubscriber implements Observer {

    private String newsString;
    private Publisher publisher;

    public EventSubscriber(Publisher publisher){
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        newsString = title + "\n*******************************\n" + news;
        display();
    }

    public void display(){
        Log.e("display", "\n\n===이벤트 유저===");
    }

    public void withdraw(){
        publisher.delete(this);
    }
}
