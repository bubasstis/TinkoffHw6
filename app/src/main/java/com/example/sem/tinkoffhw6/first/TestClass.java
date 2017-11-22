package com.example.sem.tinkoffhw6.first;

/**
 * Created by sem on 20.11.17.
 */

public class TestClass {
    private String firstParam;
    private int secondParam;

    public TestClass(String firstParam,int secondParam){
        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }

    public String getFirstParam(){return firstParam;}
    public int getSecondParam(){return secondParam;}

    @Override
    public String toString() {
        return "TestClass{\n" +
                "           firstParam='" + firstParam + '\'' +
                ",\n            secondParam=" + secondParam + " \n        "+
                '}';
    }
}
