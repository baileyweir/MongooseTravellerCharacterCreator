package com.example.charactercreatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Go to Create New Character Activity when user taps button */
    public void createNewChar(View view){
        Intent intent = new Intent(this, CreateNewCharActivity.class);
        startActivity(intent);
    }
}