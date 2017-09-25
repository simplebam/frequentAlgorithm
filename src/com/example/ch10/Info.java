package com.example.ch10;


/**
 * Created by yueyue on 2017/7/31.
 */
public class Info {
    private String key;

    private String name;
    private static int count = 0;


    public Info(String key, String name) {
        this.key = key;
        this.name = name;
        count++;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
