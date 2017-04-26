package com.scoutbuddy.trail4.myatm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button mSimple = (Button) findViewById(R.id.Simple);
        Button mFactorial = (Button) findViewById(R.id.Factorial);
        Button mMainActivitybtn = (Button) findViewById(R.id.MainActivitybtn);
        Button mOrdernumbers = (Button) findViewById(R.id.ordernumbers);
        Button mPrime = (Button) findViewById(R.id.Prime);
        Button mPal = (Button) findViewById(R.id.Pal);
        Button mButtonShapes=(Button) findViewById(R.id.buttonShape);
        Button mButtonEMI=(Button) findViewById(R.id.buttonEMI);
        Button mVowels=(Button) findViewById(R.id.Vowels);

        mSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent1 = new Intent(StartScreen.this,Simple_Cal.class);
                        startActivity(intent1);
                    }
                });

        mFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(StartScreen.this,Factorial.class);
                startActivity(intent2);
            }
        });

        mMainActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(StartScreen.this,MainActivity.class);
                startActivity(intent3);
            }
        });

        mOrdernumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(StartScreen.this,Asc_DescImproved.class);
                startActivity(intent4);
            }
        });

        mPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreen.this,PrimeOrNot.class);
                startActivity(intent5);
            }
        });

        mPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreen.this,Palindrome.class);
                startActivity(intent5);
            }
        });

        mButtonShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreen.this,Shapes_Areas.class);
                startActivity(intent5);
            }
        });

        mButtonEMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreen.this,EMIsimulator.class);
                startActivity(intent5);
            }
        });

        mVowels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreen.this,VowelConsonants.class);
                startActivity(intent5);
            }
        });
    }
}
