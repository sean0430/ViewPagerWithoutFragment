package com.nanastudio.sean.viewpagerwithoutfragment;

import java.io.Serializable;

/**
 * NoFragmentDemo
 * Created by Sean on 2016/9/1下午2:40.
 */
public class FruitInfo implements Serializable {

    private String name;
    private String color;

    public FruitInfo(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
