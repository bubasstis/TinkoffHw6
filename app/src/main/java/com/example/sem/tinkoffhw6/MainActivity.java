package com.example.sem.tinkoffhw6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sem.tinkoffhw6.first.FirstActivity;
import com.example.sem.tinkoffhw6.fourth.FourthActivity;
import com.example.sem.tinkoffhw6.second.SecondActivity;
import com.example.sem.tinkoffhw6.third.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_first_task).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.btn_second_task).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.btn_third_task).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdActivity.start(MainActivity.this);
            }
        });

        findViewById(R.id.btn_fourth_task).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FourthActivity.start(MainActivity.this);
            }
        });
    }
}
