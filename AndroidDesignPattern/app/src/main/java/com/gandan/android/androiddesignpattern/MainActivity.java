package com.gandan.android.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gandan.android.androiddesignpattern.builder.BuilderPattern;
import com.gandan.android.androiddesignpattern.builder.ConstructorPattern;
import com.gandan.android.androiddesignpattern.builder.JavaBeanPattern;

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
    }
}
