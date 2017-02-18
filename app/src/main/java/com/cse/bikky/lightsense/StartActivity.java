package com.cse.bikky.lightsense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.View;
import android.widget.TextView;


public class StartActivity extends AppCompatActivity implements SensorEventListener {


    private TextView data;
    private Sensor mySense;
    private SensorManager SM;


    @Override
    public void onSensorChanged(SensorEvent event) {
        data.setText("L: " + event.values[0]+ " lx");
        float values = event.values[0];


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        //not needed now
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Create Sensor manager
        SM = (SensorManager) getSystemService(SENSOR_SERVICE);

        //Light sensor
        mySense = SM.getDefaultSensor(Sensor.TYPE_LIGHT);

        //register listener
        SM.registerListener(this, mySense, SensorManager.SENSOR_DELAY_NORMAL);

        //Assign TextView
        data = (TextView) findViewById(R.id.textView3);

    }
}