package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();


        TextView name = findViewById(R.id.name);
        TextView age = findViewById(R.id.age);

        String Name = bundle.getString("data");
        String Age = bundle.getString("data2");

        name.setText(Name);
        age.setText(Age);


    }
}