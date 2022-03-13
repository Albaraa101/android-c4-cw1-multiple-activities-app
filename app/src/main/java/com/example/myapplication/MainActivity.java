package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText age = findViewById(R.id.editTextTextPersonName2);
        Button calculate = findViewById(R.id.calculate);


            calculate.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String data = name.getText().toString();
                    String data2 = age.getText().toString();
                    calculate.setEnabled(false);
                    name.addTextChangedListener(textWatcher);
                    age.addTextChangedListener(textWatcher);
                    final Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("data", data);
                    intent.putExtra("data2", data2);
                    startActivity(intent);
                }

                private TextWatcher textWatcher = new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int count, int after) {
                        String n = name.getText().toString();
                        String a = age.getText().toString();

                        if (!n.isEmpty() && !a.isEmpty()) {
                            //both are not empty
                            calculate.setEnabled(true);
                        } else {
                            calculate.setEnabled(false);
                        }
                    }


                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                };
            });
        }
    }
