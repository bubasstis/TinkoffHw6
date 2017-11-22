package com.example.sem.tinkoffhw6.second;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by sem on 22.11.17.
 */

public class SecondPojo {
    private String name;
    @SerializedName("any_map")
    private Map<String, String> anyMap;

    public SecondPojo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAnyMap() {
        return anyMap;
    }

    public void setAnyMap(Map<String, String> anyMap) {
        this.anyMap = anyMap;
    }
}
