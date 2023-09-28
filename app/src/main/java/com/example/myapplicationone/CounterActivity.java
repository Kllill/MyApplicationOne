package com.example.myapplicationone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int count = 0;
    private TextView tvCount;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Button btnShowNumber = findViewById(R.id.btnShowNumber);
        btnShowNumber.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //nothing
            }
        });

        tvCount=findViewById(R.id.tvCount);
        Button btnCount = findViewById(R.id.btnCount);
        btnCount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvCount.setText(Integer.toString(++count));
            }
        });
    }
}
