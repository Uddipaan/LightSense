package com.cse.bikky.lightsense;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Locate the button in activity_main.xml
                button = (Button) findViewById(R.id.MyButton);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                       StartActivity.class);
                startActivity(myIntent);
            }
        });
    }

    public void onClick(View v) {
        finish();
        System.exit(0);
    }

}
