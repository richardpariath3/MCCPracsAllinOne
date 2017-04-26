package com.scoutbuddy.trail4.myatm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asc_DescImproved extends AppCompatActivity {


    TextView textview1, textview2, textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asc__desc_improved);

        textview1 = (TextView) findViewById(R.id.textView1);
        textview2 = (TextView) findViewById(R.id.textView2);
        textview3 = (TextView) findViewById(R.id.textView3);


        //Initializing integer array list;
        List<Integer> integerList = new ArrayList<Integer>();

        //Dynamically adding values to integer array list.

        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(2);
        integerList.add(4);
        integerList.add(6);

        //Printing integer array list without sorting values.

        for (int i = 0; i < integerList.size(); i++) {

            textview1.setText(textview1.getText() + " " + integerList.get(i) + " , ");
        }

        //Sort array list into Ascending order.

        Collections.sort(integerList);

        //Printing integer array list into Ascending order.

        for (int i = 0; i < integerList.size(); i++) {

            textview2.setText(textview2.getText() + " " + integerList.get(i) + " , ");
        }

        //Sort array list into Descending order.

        Collections.reverse(integerList);

        //Printing integer array list into Descending order.

        for (int i = 0; i < integerList.size(); i++) {

            textview3.setText(textview3.getText() + " " + integerList.get(i) + " , ");
        }



    }



}



