package com.prakhar_parikh.sem_5_mcad;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_WIFI = 101;
    private static final int REQUEST_CODE_BLUETOOTH = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleWiFi(View view) {
        togglePermission(Manifest.permission.ACCESS_WIFI_STATE, REQUEST_CODE_WIFI);
    }

    public void toggleBluetooth(View view) {
        togglePermission(Manifest.permission.BLUETOOTH, REQUEST_CODE_BLUETOOTH);
    }

    private void togglePermission(String permission, int requestCode) {
        if (ActivityCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{permission}, requestCode);
        } else {
            if (permission.equals(Manifest.permission.ACCESS_WIFI_STATE)) {
                ((WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE)).setWifiEnabled(
                        !((WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE)).isWifiEnabled());
            } else if (permission.equals(Manifest.permission.BLUETOOTH)) {
                BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (bluetoothAdapter != null) {
                    if (bluetoothAdapter.isEnabled()) {
                        bluetoothAdapter.disable();
                    } else {
                        bluetoothAdapter.enable();
                    }
                }
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
        }
    }
}