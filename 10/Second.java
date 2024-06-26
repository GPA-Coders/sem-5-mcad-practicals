package com.prakhar_parikh.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SharedPreferences sp = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        String data = "Data stored: " + sp.getString("Data", "");

        TextView textData = findViewById(R.id.text_data_sent);
        textData.setText(data);

        Button btn = findViewById(R.id.btn_second);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}