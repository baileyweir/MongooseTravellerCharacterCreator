package com.example.charactercreatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CreateNewCharActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_char);

        // Get the Intent that started this activity
        Intent intent = getIntent();

        Spinner raceSpinner = (Spinner) findViewById(R.id.spinner_race);
        Spinner homeSpinner = (Spinner) findViewById(R.id.spinner_hometown);
        Spinner genderSpinner = (Spinner) findViewById(R.id.spinner_gender);

        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this,
                R.array.races_array, android.R.layout.simple_spinner_item);
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        raceSpinner.setAdapter(raceAdapter);
    }
}