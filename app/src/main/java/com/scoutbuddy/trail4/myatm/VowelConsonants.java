package com.scoutbuddy.trail4.myatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VowelConsonants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel_consonants);

        final EditText mentertext=(EditText) findViewById(R.id.entertexthere);
        final Button menterbutton=(Button) findViewById(R.id.enterbutton);

       final TextView svowels=(TextView) findViewById(R.id.vowelstext);
        final TextView snumbershere=(TextView) findViewById(R.id.numberstext);
        final TextView sspace=(TextView) findViewById(R.id.spacetext);
        final TextView sconsonants=(TextView) findViewById(R.id.consonantstext);

        menterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vowels=0;
                int consonants=0;
                int space=0;
                int numbershere=0;
                String testString=mentertext.getText().toString();
                char ch;
                for(int i=testString.length()-1;i>=0;i--)
                {
                    ch=testString.charAt(i);
                    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                    {
                        vowels++;

                    }
                    else if (Character.isDigit(ch))
                    {
                        numbershere++;
                    }
                    else if (Character.isWhitespace(ch))
                    {
                        space++;
                    }
                    else
                    {
                        consonants++;
                    }
                }

                svowels.setText(""+vowels);
                snumbershere.setText(""+numbershere);
                sspace.setText(""+space);
                sconsonants.setText(""+consonants);
            }
        });
    }
}
