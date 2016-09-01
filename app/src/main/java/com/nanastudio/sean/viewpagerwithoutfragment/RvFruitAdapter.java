package com.nanastudio.sean.viewpagerwithoutfragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * NoFragmentDemo
 * Created by Sean on 2016/9/1下午2:37.
 */
public class RvFruitAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    private List<FruitInfo> fruitInfos;

    public RvFruitAdapter(List<FruitInfo> fruitInfos) {
        this.fruitInfos = fruitInfos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FruitViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_fruit,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        FruitInfo fruitInfo = fruitInfos.get(position);
        ((FruitViewHolder)holder).bindData(fruitInfo);
    }

    @Override
    public int getItemCount() {
        return fruitInfos.size();
    }

    class FruitViewHolder extends RecyclerView.ViewHolder {
        public FruitViewHolder(View itemView) {
            super(itemView);
        }

        public void bindData(FruitInfo fruitInfo) {
            getTvName().setText(fruitInfo.getName());
            getTvColor().setText(fruitInfo.getColor());
        }

        private TextView getTvName() {
            return (TextView) itemView.findViewById(R.id.tvName);
        }

        private TextView getTvColor() {
            return (TextView) itemView.findViewById(R.id.tvColor);
        }
    }

}
