package com.prakhar_parikh.sem_5_mcad;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogButton = findViewById(R.id.showDialogButton);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the AlertDialog when the button is clicked
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Example")
                .setMessage("This is an example of AlertDialog in Android.")
                .setPositiveButton("OK", null) // You can handle positive button click separately if needed
                .setNegativeButton("Cancel", null) // You can handle negative button click separately if needed
                .show();
    }
}
