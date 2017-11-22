package com.example.sem.tinkoffhw6.first;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sem.tinkoffhw6.R;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FirstActivity extends AppCompatActivity {

    private Gson gson;
    private TestClass testClass;
    private TextView resultText;


    public static void start(Context context) {
        Intent starter = new Intent(context, FirstActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        resultText = findViewById(R.id.tv_first_task);

        gson = new GsonBuilder()
                .setExclusionStrategies(
                        new ExclusionStrategy() {
                            @Override
                            public boolean shouldSkipField(FieldAttributes f) {
                                return f.getName().equals("firstParam");
                            }

                            @Override
                            public boolean shouldSkipClass(Class<?> clazz) {
                                return false;
                            }

                        })
                .setPrettyPrinting()
                .create();
        testClass = new TestClass("FirstParam",2);
        String json = gson.toJson(testClass, TestClass.class);
        resultText.setText("После исключения ненужных полей - \n " + json);
    }
}
