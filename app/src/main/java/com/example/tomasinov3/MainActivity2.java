package com.example.tomasinov3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openProximity(View view) {
        startActivity(new Intent(MainActivity2.this, ProximityActivity.class));
    }
    public void openGyroscope(View view) {
        startActivity(new Intent(MainActivity2.this, GyroscopeActivity.class));
    }
    public void openRotationVector(View view) {
        startActivity(new Intent(MainActivity2.this, RotationVectorActivity.class));
    }
}
