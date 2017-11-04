package com.code.pali.mysunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.code.pali.mysunshine.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jazz on 04/11/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.weatherViewHolder> {

    @Override
    public weatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.wather_item, parent, false);
        return new weatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(weatherViewHolder holder, int position) {

        holder.itemTitel.setText("cuaca hari ini taggal"+ position);

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class weatherViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_titel)
        TextView itemTitel;

        public weatherViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
