package com.example.sem.tinkoffhw6.third;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sem.tinkoffhw6.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.math.BigDecimal;

public class ThirdActivity extends AppCompatActivity {

    private Gson gson;
    private String testJson;

    public static void start(Context context) {
        Intent starter = new Intent(context, ThirdActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView result = findViewById(R.id.tv_third_task);

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(BigDecimal.class, new BigDecimalDeserializer())
                .create();
        //тестовый json
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("money_amount", "2444,88");
        testJson = gson.toJson(jsonObject);
        BigDecimal bigDecimal = gson.fromJson(testJson, BigDecimal.class);
        result.setText("Result : " + bigDecimal.toString());

    }
}
