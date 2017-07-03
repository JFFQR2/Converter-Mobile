package com.river.root.converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{
private ImageView inform;
private ImageView cpu;
private ImageView speed;
private ImageView temperature;
private ImageView time;
private ImageView square;
private ImageView ilong;
private ImageView mass;
private ImageView power;
private ImageView about;
static int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inform = (ImageView) findViewById(R.id.imageView_information);
        cpu = (ImageView) findViewById(R.id.imageView_cpu);
        speed = (ImageView) findViewById(R.id.imageView_speed);
        temperature = (ImageView) findViewById(R.id.imageView_temperature);
        time = (ImageView) findViewById(R.id.imageView_time);
        square = (ImageView) findViewById(R.id.imageView_square);
        ilong = (ImageView) findViewById(R.id.imageView_long);
        mass = (ImageView) findViewById(R.id.imageView_mass);
        power = (ImageView) findViewById(R.id.imageView_power);
        about = (ImageView) findViewById(R.id.imageView_about);
        inform.setOnClickListener(this);
        cpu.setOnClickListener(this);
        speed.setOnClickListener(this);
        temperature.setOnClickListener(this);
        time.setOnClickListener(this);
        square.setOnClickListener(this);
        ilong.setOnClickListener(this);
        mass.setOnClickListener(this);
        power.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView_information:startActivity(new Intent(this,SecondActivity.class));
                position=0;
                break;
            case R.id.imageView_speed:startActivity(new Intent(this,SecondActivity.class));
                position=1;
                break;
            case R.id.imageView_temperature:startActivity(new Intent(this,SecondActivity.class));
                position=2;
                break;
            case R.id.imageView_cpu:startActivity(new Intent(this,SecondActivity.class));
                position=3;
                break;
            case R.id.imageView_mass:startActivity(new Intent(this,SecondActivity.class));
                position=4;
                break;
            case R.id.imageView_long:startActivity(new Intent(this,SecondActivity.class));
                position=5;
                break;
            case R.id.imageView_time:startActivity(new Intent(this,SecondActivity.class));
                position=6;
                break;
            case R.id.imageView_square:startActivity(new Intent(this,SecondActivity.class));
                position=7;
                break;
            case R.id.imageView_power:startActivity(new Intent(this,SecondActivity.class));
                position=8;
                break;
            case R.id.imageView_about:startActivity(new Intent(this,SecondActivity.class));
                position=9;
                break;
        }
    }
}
