package com.nanastudio.sean.viewpagerwithoutfragment;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * NoFragmentDemo
 * Created by Sean on 2016/9/1下午2:56.
 */
public class MockData {

    private List<FruitInfo> getMockFruits(String name, String color) {

        List<FruitInfo> fruitInfos = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            fruitInfos.add(getMockFruit(name, color));
        }
        return fruitInfos;
    }

    private FruitInfo getMockFruit(String name, String color) {
        return new FruitInfo(name, color);
    }


    //Set RecyclerView in each View
    public void setRvFruit(Context context, View view,
                           String name, String color) {

        RecyclerView rvFruit = (RecyclerView) view.findViewById(R.id.rvFruit);
        rvFruit.setHasFixedSize(true);
        rvFruit.setLayoutManager(new LinearLayoutManager(context));
        RvFruitAdapter adapter = new RvFruitAdapter(getMockFruits(name, color));
        rvFruit.setAdapter(adapter);
    }
}
