package com.example.vineet.quizapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Fourth extends AppCompatActivity {
Button b4;
    TextView t1;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b4=(Button)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.textView4);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.9f);

            }
        });
        t1.setText("Your Score is "+MainActivity.score);
        ts.speak("Your Score is "+t1, TextToSpeech.QUEUE_FLUSH,null);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fourth.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
