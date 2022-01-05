package com.example.vineet.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Third extends AppCompatActivity {
    Button b3;
    RadioButton r9,r10,r11,r12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b3=(Button)findViewById(R.id.button3);
        r9=(RadioButton)findViewById(R.id.radioButton9);
        r10=(RadioButton)findViewById(R.id.radioButton10);
        r11=(RadioButton)findViewById(R.id.radioButton11);
        r12=(RadioButton)findViewById(R.id.radioButton12);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r9.isChecked())
                {
                    ++MainActivity.score;
                }
                else
                {
                    --MainActivity.score;
                }
                Intent i=new Intent(Third.this,Fourth.class);
                startActivity(i);
                finish();
            }
        });
    }
}
