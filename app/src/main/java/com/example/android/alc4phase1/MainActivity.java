package com.example.android.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1= (Button) findViewById(R.id.about_alc);
        Button but2= (Button) findViewById(R.id.button_about);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=  new Intent(MainActivity.this,Main2Activity.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2= new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(int2);
            }
        });


    }



}

