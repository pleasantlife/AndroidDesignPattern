package com.gandan.android.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gandan.android.androiddesignpattern.adapter.CameraAdapterByObject;
import com.gandan.android.androiddesignpattern.adapter.Connectable;
import com.gandan.android.androiddesignpattern.builder.BuilderPattern;
import com.gandan.android.androiddesignpattern.builder.ConstructorPattern;
import com.gandan.android.androiddesignpattern.builder.JavaBeanPattern;
import com.gandan.android.androiddesignpattern.facade.Amplifier;
import com.gandan.android.androiddesignpattern.facade.DVDPlayer;
import com.gandan.android.androiddesignpattern.facade.HomeTheaterFacade;
import com.gandan.android.androiddesignpattern.facade.PopcornPopper;
import com.gandan.android.androiddesignpattern.facade.Projector;
import com.gandan.android.androiddesignpattern.facade.Screen;
import com.gandan.android.androiddesignpattern.facade.TheaterLights;
import com.gandan.android.androiddesignpattern.facade.Tuner;
import com.gandan.android.androiddesignpattern.factory.Pizza;
import com.gandan.android.androiddesignpattern.observer.AnnualSubscriber;
import com.gandan.android.androiddesignpattern.observer.EventSubscriber;
import com.gandan.android.androiddesignpattern.observer.NewsCenter;
import com.gandan.android.androiddesignpattern.proxy.IService;
import com.gandan.android.androiddesignpattern.proxy.Proxy;
import com.gandan.android.androiddesignpattern.proxy.ProxyService;
import com.gandan.android.androiddesignpattern.singleton.CustomSingletonPattern;
import com.gandan.android.androiddesignpattern.singleton.EagerSingletonPattern;
import com.gandan.android.androiddesignpattern.singleton.HolderSingletonPattern;
import com.gandan.android.androiddesignpattern.singleton.LazySingletonPattern;
import com.gandan.android.androiddesignpattern.strategy.Soldier;
import com.gandan.android.androiddesignpattern.strategy.Strategy;
import com.gandan.android.androiddesignpattern.strategy.StrategyGrenade;
import com.gandan.android.androiddesignpattern.strategy.StrategyGun;
import com.gandan.android.androiddesignpattern.templatecallback.SoldierWithRefactoring;

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
        CustomSingletonPattern.init(this);
        CustomSingletonPattern customSingletonPattern = CustomSingletonPattern.getInstance();


        //팩토리 패턴
        Pizza.PizzaFactory(Pizza.PizzaType.Seafood).getPrice();

        //옵저버 패턴
        NewsCenter newsCenter = new NewsCenter();
        AnnualSubscriber as = new AnnualSubscriber(newsCenter);
        EventSubscriber es = new EventSubscriber(newsCenter);

        es.withdraw();

        //파사드 패턴
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(),
                new DVDPlayer(), new Projector(), new Screen(), new TheaterLights(), new PopcornPopper());
        homeTheaterFacade.watchMovie("극한직업");

        //어댑터 패턴
        Connectable connectable = new CameraAdapterByObject();
        connectable.connectCameraA();
        connectable.connectCameraB();

        //프록시 패턴
        IService proxy = new Proxy();
        Log.e("Proxy", proxy.runSomething());

        //전략(Strategy) 패턴
        Strategy strategy = null;
        Soldier army = new Soldier();
        strategy = new StrategyGun();
        army.runContext(strategy);

        strategy = new StrategyGrenade();
        army.runContext(strategy);

        //탬플릿 콜백 패턴
        SoldierWithRefactoring airforce = new SoldierWithRefactoring();
        airforce.runContext("KF-16");

    }
}
