package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeOrNot extends AppCompatActivity {

    EditText ed;
    TextView mtv2;
    Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_or_not);

        ed=(EditText) findViewById(R.id.input2);

        bt3=(Button) findViewById(R.id.mbt3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num=Double.parseDouble(ed.getText().toString());
                int f=0;

                mtv2=(TextView) findViewById(R.id.tv2);
                for(int i=2;i<num;i++)
                {
                    if(num%i==0)
                    {
                        f=1;
                        break;
                    }
                    if(num==1 || num==0)
                    {
                        f=0;
                        break;
                    }
                }
                if(f==0)
                {
                    mtv2.setText("Is prime");
                }
                else
                {
                    mtv2.setText("Not prime");
                }
            }
        });
    }
}
