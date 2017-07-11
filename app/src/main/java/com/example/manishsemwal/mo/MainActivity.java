package com.example.manishsemwal.mo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void fun1(View view) {
        Intent intent = new Intent(MainActivity.this, IntroActivity.class);
        startActivity(intent);
    }

    public void fun2(View view){
        Intent intent = new Intent(MainActivity.this, SyllActivity.class);
        startActivity(intent);
    }

    public void fun3(View view){
        Intent intent = new Intent(MainActivity.this, PreYearActivity.class);
        startActivity(intent);
    }

    public void fun4(View view){
        Intent intent = new Intent(MainActivity.this, BooksActivity.class);
        startActivity(intent);
    }
}