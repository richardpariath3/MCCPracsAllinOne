package com.scoutbuddy.trail4.myatm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    Button mnext;
    EditText amt;
    TextView C2000;
    TextView C500;
    TextView C100;
    TextView Balance;
    Button msimplecal;
  //  TextView mContent;
   // TextView mContent1;
   // TextView mContent2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = (EditText) findViewById(R.id.amount);
//        mContent = (TextView) findViewById(R.id.Content);
  //      mContent1 = (TextView) findViewById(R.id.Content1);
    //    mContent2 = (TextView) findViewById(R.id.Content2);
        C2000 = (TextView) findViewById(R.id.c2000);
        C500 = (TextView) findViewById(R.id.c500);
        C100 = (TextView) findViewById(R.id.c100);
        submit = (Button) findViewById(R.id.get);
        msimplecal = (Button) findViewById(R.id.simplecal);
        mnext=(Button) findViewById(R.id.menu);
        Balance = (TextView) findViewById(R.id.bal);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
    }

    public void calc() {

        Integer amt1=Integer.parseInt(amt.getText().toString());
        int c2000=0,c500=0,c100=0;
        Balance.setText(""+amt1);
        while(amt1>=99) {
            if (amt1 >= 2000) {
                ++c2000;
                amt1=amt1-2000;
            }
            if (amt1 >= 500 && amt1 <= 2000) {
                ++c500;
                amt1=amt1-500;
            }
            if (amt1 >= 100 && amt1 < 500) {
                ++c100;
                amt1=amt1-100;

            }



            Balance.setText(""+amt1);
        }


        C2000.setText(""+c2000);
        C500.setText(""+c500);
        C100.setText(""+c100);





    }
}

