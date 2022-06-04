package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.people.PeopleManager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ArrayList<String> names=new ArrayList<>();
    names.add("John");
    names.add("Mike");
    names.add("Jim");
    names.add("Vasia");
        System.out.println(names.get(1)); //распечатка имени из листа

        List<Person> peoples=new ArrayList(); //работа с Листом
        Person pl=new Person("Meerim",78);
        peoples.add(pl);
        peoples.add(new Person("Lisa", 33));
        peoples.add(new Person("Mike",23));
        peoples.add(new Person("Mirlan",33));
        peoples.add(new Person("Jack",21));
        peoples.add(new Person("Lucie",54));
        peoples.add(new Person("Scarlet",21));

        Iterator<Person> iter = peoples.iterator(); //работа с Итератором
        while(iter.hasNext()){
            Person p = iter.next();
            System.out.println(p.getName() + "возраст" + p.getAge());
        }
    }
}