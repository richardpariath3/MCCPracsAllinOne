package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {

    EditText mEdit;
    TextView mTV;
    Button mBT;
    TextView mTV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        mEdit=(EditText) findViewById(R.id.Edit);
        mTV=(TextView) findViewById(R.id.TV);
        mBT=(Button) findViewById(R.id.BT);
        mTV2=(TextView) findViewById(R.id.TV2);

        mBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original=mEdit.getText().toString();
                String reverse="";

                int length = original.length();
                for(int i=length-1;i>=0;i--)
                {
                    reverse=reverse+original.charAt(i);
                    mTV.setText(reverse);
                }

                if(reverse.equals(original))
                {
                    mTV2.setText("Is Palindrome");
                }
                else
                {
                    mTV2.setText("Not Palindrome");
                }


            }
        });

    }
}
