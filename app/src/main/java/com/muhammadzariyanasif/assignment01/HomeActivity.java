package com.muhammadzariyanasif.assignment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void firstActivity(View view)
    {
        TextView text1= (TextView) findViewById(R.id.helloWorld);


        Intent intent = new Intent(HomeActivity.this,NextActivity.class);
        intent.putExtra("New Activity","I am in 2nd Activity");
        startActivity(intent);

    }
}
