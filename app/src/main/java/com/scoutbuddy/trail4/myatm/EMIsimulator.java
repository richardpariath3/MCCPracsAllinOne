package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EMIsimulator extends AppCompatActivity {

    private EditText mLoanAmt, mInterestRate, mLoanPeriod;
    private Double P,r,n,res;
    private Button submit;
    private TextView mED4,mED5,mED6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emisimulator);

        mLoanAmt=(EditText) findViewById(R.id.price);
        mLoanPeriod=(EditText) findViewById(R.id.month);
        mInterestRate=(EditText) findViewById(R.id.rate);
        submit=(Button) findViewById(R.id.buttonLoan);
        mED4=(TextView) findViewById(R.id.ED4);
        mED5=(TextView) findViewById(R.id.ED5);
        mED6=(TextView) findViewById(R.id.ED6);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double SimpleInt;
                double CompoundInt;
                double ValueOfLoan;
                P=Double.parseDouble(mLoanAmt.getText().toString());
                r=Double.parseDouble(mInterestRate.getText().toString());
                n=Double.parseDouble(mLoanPeriod.getText().toString());

                r=r/(12*100);
                res=P*r*Math.pow((1+r),n)/(Math.pow(1+r,n)-1);
                SimpleInt=P*r*n;

                ValueOfLoan=P*(Math.pow((1+(r/n)),n));
                CompoundInt=ValueOfLoan-P;

                mED4.setText("₹ "+SimpleInt);
                mED5.setText("₹ "+CompoundInt);
                mED6.setText("₹ "+res);

            }
        });


    }
}
