package com.muhammadzariyanasif.assignment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView t= (TextView) findViewById(R.id.newText);

        Intent i=getIntent();

        String s1 =i.getStringExtra("New Activity");

        t.setText(s1);




    }
}
