package com.gandan.android.androiddesignpattern.observer;

import android.util.Log;

public class AnnualSubscriber implements Observer {

    private String newsString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher){
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newsString = title = " \n --------------- \n" + news;
        display();
    }

    private void display(){
        Log.e("news", "\n\n오늘의 뉴스\n=======================\n\n");
    }
}
