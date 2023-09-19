package com.prakhar_parikh.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String data = "Data sent: " + intent.getStringExtra("data");

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