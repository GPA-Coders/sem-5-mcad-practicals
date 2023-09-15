package com.example.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("--------------------On Create");
    }
    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("--------------------On Start");
    }
    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("--------------------On Pause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("--------------------On Resume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("--------------------On Stop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("--------------------On Restart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("--------------------On Destroy");
    }
}