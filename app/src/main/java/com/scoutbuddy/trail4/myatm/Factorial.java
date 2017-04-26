package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factorial extends AppCompatActivity {

    EditText minput;
    Button mbt;
    TextView mresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        minput=(EditText) findViewById(R.id.input);
        mbt=(Button) findViewById(R.id.bt);
        mresult=(TextView) findViewById(R.id.result);

        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=1;
                Integer num=Integer.parseInt(minput.getText().toString());
                for(int i=num;i>0;i--)
                {
                    sum=i*sum;
                }

                if(num==0)
                {
                    mresult.setText("1");
                }
                else
                {
                    mresult.setText(""+sum);
                }
            }
        });
    }
}
