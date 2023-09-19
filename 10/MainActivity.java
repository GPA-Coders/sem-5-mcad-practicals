package com.prakhar_parikh.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "Hello, from MainActivity!";

                SharedPreferences.Editor editor = getSharedPreferences("SharedPref", Context.MODE_PRIVATE).edit();
                editor.putString("Data", data);
                editor.apply();

                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });
    }
}