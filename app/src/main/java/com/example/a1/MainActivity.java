package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void say (String name) {
        System.out.println("Ffdfs" + name);
    }
}