package com.example.akshay.parth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Source extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);

    }


    public void Tutor(View view) {
        Intent i=new Intent(this,tutor.class);
        startActivity(i);
    }
}
