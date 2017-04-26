package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Shapes_Areas extends AppCompatActivity {


    EditText mlength;
    EditText mbreadth;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes__areas);

        mlength=(EditText) findViewById(R.id.length);
        mbreadth=(EditText) findViewById(R.id.breadth);
        mTextView=(TextView) findViewById(R.id.TextViewResult);


        final RadioGroup group = (RadioGroup) findViewById(R.id.radioChoice);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                int id=group.getCheckedRadioButtonId();
                double resultArea;
                Double len=Double.parseDouble(mlength.getText().toString());
                Double bre=Double.parseDouble(mbreadth.getText().toString());

                switch (id)
                {
                    case R.id.radioSquare:
                        if(len.equals(bre))
                        {
                            resultArea=len*len;
                            mTextView.setText(""+resultArea);

                        }
                        else
                        {
                            mTextView.setText("Square needs all sides same, if you didn't know that");
                        }
                        break;

                    case R.id.radioRectangle:
                        if(len.equals(bre))
                        {
                            resultArea=len*len;
                            mTextView.setText("It's a square, not a rectangle = "+resultArea);
                        }
                        else
                        {
                            resultArea=len*bre;
                            mTextView.setText(""+resultArea);
                        }
                        break;

                    case R.id.radioTriangle:
                        resultArea=0.5*len*bre;
                        mTextView.setText(""+resultArea);
                        break;
                }
            }

        });



    }

}
