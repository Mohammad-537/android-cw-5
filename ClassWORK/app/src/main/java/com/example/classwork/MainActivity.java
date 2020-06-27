package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        private EditText B1 = null;
        private EditText B2;

        final Button Grade =findViewById(R.id.B1);
        final Button Grade =findViewById(R.id.B2);
        //sorry I did't finish at time this what I did at 30 minute


        public void onCLick(View );

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(MainActivity.this, com.example.gradecalculator.MainActivity);
                startActivity(B1);
            }
        });

    }
}