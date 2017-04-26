package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Setthatost extends AppCompatActivity {

    Button mhottoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setthatost);

        mhottoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "That's a freaking toast!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
