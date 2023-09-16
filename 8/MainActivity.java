package com.prakhar_parikh.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup grp = (RadioGroup) findViewById(R.id.radio_group);
        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.male){
                    System.out.println("Current gender selected : Male");
                }
                else if(checkedId == R.id.female){
                    System.out.println("Current gender selected : Female");
                }
            }
        });

        CheckBox check_btn = findViewById(R.id.check_btn);
        check_btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    System.out.println("Thanks for agreeing to terms and conditions");
                }
                else{
                    System.out.println("Please agree to terms and conditions");
                }
            }
        });
    }
}