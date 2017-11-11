package com.code.pali.mysunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.code.pali.mysunshine.R;
import com.code.pali.mysunshine.Weather;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jazz on 04/11/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.weatherViewHolder> {

    List<Weather> weatherList;
    public WeatherAdapter(List<Weather> weatherListData) {
        weatherList = weatherListData;

    }

    @Override
    public weatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.wather_item, parent, false);
        return new weatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(weatherViewHolder holder, int position) {

        holder.itemTitel.setText("cuaca hari ini taggal"+ position);
        holder.wetherimg.setImageResource(weatherList.get(position).getWeatherimg());
        holder.watheritemdata.setText(weatherList.get(position).getWeatherData());
        holder.watheritemdesc.setText(weatherList.get(position).getWeatheDesc());
        holder.watheritemtemp.setText(weatherList.get(position).getWeathertmper());
    }


    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    class weatherViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_titel)
        TextView itemTitel;

        @BindView(R.id.wather_item_img)
        ImageView wetherimg;

        @BindView(R.id.wather_item_data)
        TextView watheritemdata;

        @BindView(R.id.wather_item_desc)
        TextView watheritemdesc;

        @BindView(R.id.wather_item_temp)
        TextView watheritemtemp;


        public weatherViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
