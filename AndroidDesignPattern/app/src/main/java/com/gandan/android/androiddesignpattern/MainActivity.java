package com.gandan.android.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gandan.android.androiddesignpattern.builder.BuilderPattern;
import com.gandan.android.androiddesignpattern.builder.ConstructorPattern;
import com.gandan.android.androiddesignpattern.builder.JavaBeanPattern;
import com.gandan.android.androiddesignpattern.factory.Pizza;
import com.gandan.android.androiddesignpattern.observer.AnnualSubscriber;
import com.gandan.android.androiddesignpattern.observer.EventSubscriber;
import com.gandan.android.androiddesignpattern.observer.NewsCenter;
import com.gandan.android.androiddesignpattern.singleton.EagerSingletonPattern;
import com.gandan.android.androiddesignpattern.singleton.HolderSingletonPattern;
import com.gandan.android.androiddesignpattern.singleton.LazySingletonPattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstructorPattern jamesPattern = new ConstructorPattern("James Gosling");
        ConstructorPattern ryanPattern = new ConstructorPattern("Ryan Gosling", "Male", "USA");

        JavaBeanPattern beanPattern = new JavaBeanPattern();
        beanPattern.setOne(1);
        beanPattern.setTwo(2);
        beanPattern.setThree(3);

        BuilderPattern.Builder builder = new BuilderPattern.Builder("Effective Java", 36)
                .memberGender("Female");

        BuilderPattern builderPattern = new BuilderPattern.Builder("Builder", 25).memberHobby("Driving").build();
        Log.e("Builder", builderPattern.getMemberName()+"");

        //싱글턴 패턴
        EagerSingletonPattern eagerSingletonPattern = EagerSingletonPattern.getInstance();
        LazySingletonPattern lazySingletonPattern = LazySingletonPattern.getInstance();
        HolderSingletonPattern holderSingletonPattern = HolderSingletonPattern.getInstance();

        //팩토리 패턴
        Pizza.PizzaFactory(Pizza.PizzaType.Seafood).getPrice();

        //옵저버 패턴
        NewsCenter newsCenter = new NewsCenter();
        AnnualSubscriber as = new AnnualSubscriber(newsCenter);
        EventSubscriber es = new EventSubscriber(newsCenter);

        es.withdraw();
    }
}
