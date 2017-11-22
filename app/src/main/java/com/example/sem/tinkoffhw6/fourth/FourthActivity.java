package com.example.sem.tinkoffhw6.fourth;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sem.tinkoffhw6.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Calendar;

public class FourthActivity extends AppCompatActivity {

    private Gson gson;

    public static void start(Context context) {
        Intent starter = new Intent(context, FourthActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView result = findViewById(R.id.tv_fouth_task);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .setDateFormat("yyyy-MM-dd")
                .create();
        Date testObject = createTestObject();

        String json = gson.toJson(testObject, Date.class);
        result.setText(json);


    }


    public Date createTestObject(){
        return new Date(new java.util.Date(Calendar.getInstance().getTimeInMillis()));
    }
}
