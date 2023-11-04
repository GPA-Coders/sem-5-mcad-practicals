package com.prakhar_parikh.sem_5_mcad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lw = findViewById(R.id.listView);
        ArrayList<String> lItems = new ArrayList<String>();
        lItems.add("One");
        lItems.add("Two");
        lItems.add("Three");
        ArrayAdapter<String> lAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.listText, lItems);
        lw.setAdapter(lAdapter);

        lItems.add("Four");
        lAdapter.notifyDataSetChanged();
        lItems.set(3,  "Updated Item");
        lAdapter.notifyDataSetChanged();
        lItems.remove(3);
        lAdapter.notifyDataSetChanged();
        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "List View : " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });

        Spinner sw = findViewById(R.id.spinnerView);
        ArrayList<String> sItems = new ArrayList<String>();
        sItems.add("One");
        sItems.add("Two");
        sItems.add("Three");
        ArrayAdapter<String> sAdapter = new ArrayAdapter<String>(this, R.layout.list_item, sItems);
        sw.setAdapter(sAdapter);

        sItems.add("Four");
        sAdapter.notifyDataSetChanged();
        sItems.set(3,  "Updated Item");
        sAdapter.notifyDataSetChanged();
        sItems.remove(3);
        sAdapter.notifyDataSetChanged();
        sw.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Spinner View : " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}