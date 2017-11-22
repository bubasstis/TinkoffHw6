package com.example.sem.tinkoffhw6.second;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sem.tinkoffhw6.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {

    private String testJson;
    private Gson gson;

    public static void start(Context context) {
        Intent starter = new Intent(context, SecondActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.tv_second_task);

        gson = new GsonBuilder()
                .registerTypeAdapter(SecondPojo.class, new SecondPojoDeserializer())
                .setPrettyPrinting()
                .create();
        testJson = gson.toJson(createTestJson());
        SecondPojo secondPojo = gson.fromJson(testJson, SecondPojo.class);
        textView.setText("Check any_map instance of HasMap - " + Boolean.toString(secondPojo.getAnyMap() instanceof HashMap));

    }

    private JsonObject createTestJson(){
        JsonObject json = new JsonObject();
        json.addProperty("name", "name");

        JsonObject jsonAnyMap = new JsonObject();
        jsonAnyMap.addProperty("1", "51235");
        jsonAnyMap.addProperty("2", "81235");
        jsonAnyMap.addProperty("3", "5236");

        json.add("any_map", jsonAnyMap);

        return json;
    }
}
