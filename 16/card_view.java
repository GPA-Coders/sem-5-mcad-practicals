package com.prakhar_parikh.sem_5_mcad;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.cardView);
        TextView textView = findViewById(R.id.textView);

        // Set content for the CardView
        textView.setText("Sample CardView Content");
    }
}
