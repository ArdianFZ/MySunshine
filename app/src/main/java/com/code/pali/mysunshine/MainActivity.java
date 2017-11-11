package com.code.pali.mysunshine;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.code.pali.mysunshine.adapter.WeatherAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//variaber
    @BindView(R.id.wahter_day_title)
     TextView wiatherDatTatel;

    @BindView(R.id.img)
     ImageView imageView;

    @BindView(R.id.wahter_dich)
     TextView wetehrDesc;

    @BindView(R.id.suhu)
     TextView wetehTemperatur;

    //bending
    @BindView(R.id.weather_List)
    RecyclerView weatherList;

    private WeatherAdapter wetherAdapter;

    private ArrayList<Weather> WeatherListData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //untuk  ngambil id
       // wiatherDatTatel = (TextView) findViewById(R.id.wahter_day_title);
       // imageView = (ImageView)  findViewById(R.id.img);
       // wetehrDesc = (TextView) findViewById(R.id.wahter_dich);
        //wetehTemperatur = (TextView) findViewById(R.id.suhu);

        //untuk meruba valu string
        wiatherDatTatel.setText("Hari minggu");
        wetehrDesc.setText("hari terang sangat");
        wetehTemperatur.setText("30 derajat aja");
         imageView.setImageResource(R.drawable.ic_launcher_foreground);

        // pengaturan list
         weatherList.setLayoutManager(
                new LinearLayoutManager(
                        this, LinearLayoutManager.VERTICAL,false));

        WeatherListData = new ArrayList<Weather>();
        WeatherListData.add(new Weather(R.mipmap.ic_launcher,"11 november 2017","cerah","17"));
        WeatherListData.add(new Weather(R.mipmap.ic_launcher,"12 november 2017","cerah sangat","30"));
        WeatherListData.add(new Weather(R.mipmap.ic_launcher,"13 november 2017","hujan","20"));
        WeatherListData.add(new Weather(R.mipmap.ic_launcher,"14 november 2017","Rintik-Rintik","28"));
        WeatherListData.add(new Weather(R.mipmap.ic_launcher,"15 november 2017","Cerah lagi","40"));


        wetherAdapter = new WeatherAdapter (WeatherListData);

        weatherList.setAdapter(wetherAdapter);


    }
}
