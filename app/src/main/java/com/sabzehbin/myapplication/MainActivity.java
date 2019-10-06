package com.sabzehbin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag", "onResume");



    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag","onPause");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag","onStart");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","onDestroy");
    }
}
