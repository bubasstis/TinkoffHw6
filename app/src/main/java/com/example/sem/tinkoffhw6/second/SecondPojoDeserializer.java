package com.example.sem.tinkoffhw6.second;

import android.util.Log;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sem on 22.11.17.
 */

public class SecondPojoDeserializer implements JsonDeserializer<SecondPojo> {


    @Override
    public SecondPojo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        SecondPojo secondPojo = new SecondPojo();

        if (json != null){

            JsonObject asJsonObject = json.getAsJsonObject();

            String name = asJsonObject.get("name").getAsString();
            Set<Map.Entry<String, JsonElement>> any_map = asJsonObject.get("any_map").getAsJsonObject().entrySet();

            HashMap<String, String> map = new HashMap<>();

            for (Map.Entry<String, JsonElement> entries : any_map) {
                map.put(entries.getKey(), entries.getValue().getAsString());
            }

            secondPojo.setName(name);
            secondPojo.setAnyMap(map);

        }

        return secondPojo;
    }
}