package com.example.mathgame;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button addition;
    Button subtraction;
    Button multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addition = findViewById(R.id.buttonadd);
        subtraction = findViewById(R.id.buttonsub);
        multi = findViewById(R.id.buttonmulti);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, game.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
