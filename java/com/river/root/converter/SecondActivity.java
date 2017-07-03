package com.river.root.converter;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends Activity implements View.OnClickListener{
    private EditText editText_inform;
    private TextView textView_inform;
    private Button button_inform;
    private Spinner spinner_inform1;
    private Spinner spinner_inform2;
    private EditText editText_temperature;
    private TextView textView_temperature;
    private Button button_temperature;
    private Spinner spinner_temperature1;
    private Spinner spinner_temperature2;
    private EditText editText_cpu;
    private TextView textView_cpu;
    private Button button_cpu;
    private Spinner spinner_cpu1;
    private Spinner spinner_cpu2;
    private EditText editText_mass;
    private TextView textView_mass;
    private Button button_mass;
    private Spinner spinner_mass1;
    private Spinner spinner_mass2;
    private EditText editText_lenght;
    private TextView textView_lenght;
    private Button button_lenght;
    private Spinner spinner_lenght1;
    private Spinner spinner_lenght2;
    private EditText editText_time;
    private TextView textView_time;
    private Button button_time;
    private Spinner spinner_time1;
    private Spinner spinner_time2;
    private EditText editText_square;
    private TextView textView_square;
    private Button button_square;
    private Spinner spinner_square1;
    private Spinner spinner_square2;
    private EditText editText_power;
    private TextView textView_power;
    private Button button_power;
    private Spinner spinner_power1;
    private Spinner spinner_power2;
    private EditText editText_speed;
    private TextView textView_speed;
    private Button button_speed;
    private Spinner spinner_speed1;
    private Spinner spinner_speed2;
    private ActionBar bar;
     private final String information = "Объем Информации";
     private final String speed = "Скорость";
     private final String temperature = "Температура";
     private final String frequency = "Частота";
     private final String mass = "Масса";
     private final String lenght = "Длина";
     private final String time = "Время";
     private final String square = "Площадь";
     private final String power = "Мощность";
     private final String about = "О Программе";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bar=getActionBar();
        switch (MainActivity.position){
            case 0:setContentView(R.layout.information);
                bar.setTitle(information);
                editText_inform = (EditText) findViewById(R.id.editText_inform);
                textView_inform = (TextView) findViewById(R.id.textView_informaion);
                button_inform = (Button) findViewById(R.id.button_inform);
                spinner_inform1 = (Spinner) findViewById(R.id.spinner_inform1);
                spinner_inform2 = (Spinner) findViewById(R.id.spinner_inform2);
                button_inform.setOnClickListener(this);
                break;
            case 1:setContentView(R.layout.speed);
                bar.setTitle(speed);
                editText_speed = (EditText) findViewById(R.id.editText_speed);
                button_speed = (Button) findViewById(R.id.button_speed);
                textView_speed = (TextView) findViewById(R.id.textView_speed);
                spinner_speed1 = (Spinner) findViewById(R.id.spinner_speed1);
                spinner_speed2 = (Spinner) findViewById(R.id.spinner_speed2);
                button_speed.setOnClickListener(this);
                break;
            case 2:setContentView(R.layout.temperature);
                bar.setTitle(temperature);
                editText_temperature = (EditText) findViewById(R.id.editText_temperature);
                textView_temperature = (TextView) findViewById(R.id.textView_temperature);
                button_temperature = (Button) findViewById(R.id.button_temperature);
                spinner_temperature1 = (Spinner) findViewById(R.id.spinner_temperature1);
                spinner_temperature2 = (Spinner) findViewById(R.id.spinner_temperature2);
                button_temperature.setOnClickListener(this);
                break;
            case 3:setContentView(R.layout.cpu);
                bar.setTitle(frequency);
                editText_cpu = (EditText) findViewById(R.id.editText_cpu);
                textView_cpu = (TextView) findViewById(R.id.textView_cpu);
                button_cpu = (Button) findViewById(R.id.button_cpu);
                spinner_cpu1 = (Spinner) findViewById(R.id.spinner_cpu1);
                spinner_cpu2 = (Spinner) findViewById(R.id.spinner_cpu2);
                button_cpu.setOnClickListener(this);
                break;
            case 4:setContentView(R.layout.mass);
                bar.setTitle(mass);
                editText_mass = (EditText) findViewById(R.id.editText_mass);
                textView_mass = (TextView) findViewById(R.id.textView_mass);
                button_mass = (Button) findViewById(R.id.button_mass);
                spinner_mass1 = (Spinner) findViewById(R.id.spinner_mass1);
                spinner_mass2 = (Spinner) findViewById(R.id.spinner_mass2);
                button_mass.setOnClickListener(this);
                break;
            case 5:setContentView(R.layout.lenght);
                bar.setTitle(lenght);
                editText_lenght = (EditText) findViewById(R.id.editText_lenght);
                textView_lenght = (TextView) findViewById(R.id.textView_lenght);
                button_lenght = (Button) findViewById(R.id.button_lenght);
                spinner_lenght1 = (Spinner) findViewById(R.id.spinner_lenght1);
                spinner_lenght2 = (Spinner) findViewById(R.id.spinner_lenght2);
                button_lenght.setOnClickListener(this);
                break;
            case 6:setContentView(R.layout.time);
                bar.setTitle(time);
                editText_time = (EditText) findViewById(R.id.editText_time);
                textView_time = (TextView) findViewById(R.id.textView_time);
                button_time = (Button) findViewById(R.id.button_time);
                spinner_time1 = (Spinner) findViewById(R.id.spinner_time1);
                spinner_time2 = (Spinner) findViewById(R.id.spinner_time2);
                button_time.setOnClickListener(this);
                break;
            case 7:setContentView(R.layout.square);
                bar.setTitle(square);
                editText_square = (EditText) findViewById(R.id.editText_square);
                textView_square = (TextView) findViewById(R.id.textView_square);
                button_square = (Button) findViewById(R.id.button_square);
                spinner_square1 = (Spinner) findViewById(R.id.spinner_square1);
                spinner_square2 = (Spinner) findViewById(R.id.spinner_square2);
                button_square.setOnClickListener(this);
                break;
            case 8:setContentView(R.layout.power);
                bar.setTitle(power);
                editText_power = (EditText) findViewById(R.id.editText_power);
                textView_power = (TextView) findViewById(R.id.textView_power);
                button_power = (Button) findViewById(R.id.button_power);
                spinner_power1 = (Spinner) findViewById(R.id.spinner_power1);
                spinner_power2 = (Spinner) findViewById(R.id.spinner_power2);
                button_power.setOnClickListener(this);
                break;
            case 9:setContentView(R.layout.about);
                bar.setTitle(about);
                break;
        }
    }

    private void converte(Spinner listIn, Spinner listOut, TextView label, EditText field) {
        if (field.getText().toString().isEmpty()) {
            field.setText("0");
        }
        int n = listIn.getSelectedItemPosition();
        switch (bar.getTitle().toString()) {
            case information:
                if ((n == 0 & listOut.getSelectedItemPosition() == 1) | (n == 1 & listOut.getSelectedItemPosition() == 2) | (n == 2 & listOut.getSelectedItemPosition() == 3) | (n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    long result = Long.parseLong(field.getText().toString()) / 1024L;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4)) {
                    long result = Long.parseLong(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0) | (n == 2 & listOut.getSelectedItemPosition() == 1) | (n == 3 & listOut.getSelectedItemPosition() == 2) | (n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    long result = Long.parseLong(field.getText().toString()) * 1024L;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2) | (n == 1 & listOut.getSelectedItemPosition() == 3) | (n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    long result = Long.parseLong(field.getText().toString()) / 1024L / 1024L;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0) | (n == 3 & listOut.getSelectedItemPosition() == 1) | (n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    long result = Long.parseLong(field.getText().toString()) * 1024L * 1024L;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3) | (n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    long result = Long.parseLong(field.getText().toString()) / 1024L / 1024L / 1024L;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0) | (n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    long result = Long.parseLong(field.getText().toString()) * 1024L * 1024L * 1024L;
                    label.setText(String.valueOf(result));
                } else if (n == 0 & listOut.getSelectedItemPosition() == 4) {
                    long result = Long.parseLong(field.getText().toString()) / 1024L / 1024L / 1024L / 1024L;
                    label.setText(String.valueOf(result));
                } else if (n == 4 & listOut.getSelectedItemPosition() == 0) {
                    long result = Long.parseLong(field.getText().toString()) * 1024L * 1024L * 1024L * 1024L;
                    label.setText(String.valueOf(result));
                }
                break;
            case speed:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if (n == 0 & listOut.getSelectedItemPosition() == 1) {
                    double result = Double.parseDouble(field.getText().toString()) * 3600D / 1000D;
                    label.setText(String.valueOf(result));
                } else if (n == 1 & listOut.getSelectedItemPosition() == 0) {
                    double result = Double.parseDouble(field.getText().toString()) / 3600D * 1000D;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.60934D;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.60934D;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.23694D;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.23694D;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.09728D;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.09728D;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.28084D;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.28084D;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.46667D;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.46667D;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.852D;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.852D;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.68781D;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.68781D;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.15078D;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.15078D;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.94384;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.94384;
                    label.setText(String.valueOf(result));
                }
                break;
            case frequency:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Long.parseLong(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1) | (n == 1 & listOut.getSelectedItemPosition() == 2) | (n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Long.parseLong(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0) | (n == 2 & listOut.getSelectedItemPosition() == 1) | (n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Long.parseLong(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2) | (n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Long.parseLong(field.getText().toString()) / 1e+6; //1000/1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0) | (n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Long.parseLong(field.getText().toString()) * 1e+6; //1000*1000;
                    label.setText(String.valueOf(result));
                } else if (n == 0 & listOut.getSelectedItemPosition() == 3) {
                    double result = Long.parseLong(field.getText().toString()) / 1e+9;//1000/1000/1000;
                    label.setText(String.valueOf(result));
                } else if (n == 3 & listOut.getSelectedItemPosition() == 0) {
                    double result = Long.parseLong(field.getText().toString()) * 1e+9; //1000*1000*1000;
                    label.setText(String.valueOf(result));
                }
                break;
            case temperature:
                if ((n == 0 & listOut.getSelectedItemPosition() == 1)) {
                    long result = Long.parseLong(field.getText().toString()) * 32;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0)) {
                    long result = Long.parseLong(field.getText().toString()) / 32;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2)) {
                    long result = Long.parseLong(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 273.15;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 273.15;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 255.372;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 255.372;
                    label.setText(String.valueOf(result));
                }
                break;
            case mass:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4) | (n == 5 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0) | (n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 14;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 14;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 6.35029;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 6.35029;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 6350.29;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 6350.29;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 157.473;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 157.473;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 224;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 224;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.20462;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.20462;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 35.274;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 35.274;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1e+6; //1000*1000
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1e+6; //1000/1000
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2204.62;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2204.62;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 35274;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 35274;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 453.592;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 453.592;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 16;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 16;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 28.3495;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 28.3495;
                    label.setText(String.valueOf(result));
                }
                break;
            case lenght:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4) | (n == 5 & listOut.getSelectedItemPosition() == 5) | (n == 6 & listOut.getSelectedItemPosition() == 6) | (n == 7 & listOut.getSelectedItemPosition() == 7) | (n == 8 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 100000;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 100000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.60934;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.60934;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1093.61;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1093.61;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3280.84;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3280.84;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 39370.1;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 39370.1;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.852;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.852;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 100;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 100;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1609.34;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1609.34;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.09361;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.09361;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.28084;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.28084;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 39.3701;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 39.3701;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1852;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1852;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 10;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 10;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 160934;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 160934;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 91.44;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 91.44;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 30.48;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 30.48;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.54;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.54;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 185200;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 185200;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.609e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.609e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 914.4;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 914.4;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 304.8;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 304.8;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 25.4;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 25.4;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.852e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.852e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1760;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1760;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 5280;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 5280;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 63360;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 63360;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.15078;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.15078;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 36;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 36;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2025.37;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2025.37;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 12;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 12;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 6076.12;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 6076.12;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 72913.4;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 72913.4;
                    label.setText(String.valueOf(result));
                }
                break;
            case time:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4) | (n == 5 & listOut.getSelectedItemPosition() == 5) | (n == 6 & listOut.getSelectedItemPosition() == 6) | (n == 7 & listOut.getSelectedItemPosition() == 7) | (n == 8 & listOut.getSelectedItemPosition() == 8) | (n == 9 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 60000;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 60000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.6e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.6e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 8.64e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 8.64e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 6.048e+8;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 6.048e+8;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.628e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.628e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+10;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+10;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+11;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+11;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+12;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+12;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2) | (n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 60;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1) | (n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 60;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3600;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3600;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 86400;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 86400;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 604800;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 604800;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.628e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.628e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+8;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+8;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.154e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.154e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1440;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1440;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 10080;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 10080;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 43800;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 43800;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 525600;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 525600;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 5.256e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 5.256e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 5.256e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 5.256e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 24;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 24;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 168;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 168;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 730.001;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 730.001;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 8760;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 8760;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 87600;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 87600;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 876000;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 876000;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) / 7;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 7;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 30.4167;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 30.4167;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 365;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 365;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3650;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3650;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 36500;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 36500;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 4.34524;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 4.34524;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 52.1429;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 52.1429;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 521.429;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 521.429;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 5214.29;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 5214.29;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 12;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 12;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 120;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) / 120;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1200;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1200;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 8) | (n == 8 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 10;
                    label.setText(String.valueOf(result));
                } else if ((n == 8 & listOut.getSelectedItemPosition() == 7) | (n == 9 & listOut.getSelectedItemPosition() == 8)) {
                    double result = Double.parseDouble(field.getText().toString()) * 10;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 9)) {
                    double result = Double.parseDouble(field.getText().toString()) / 100;
                    label.setText(String.valueOf(result));
                } else if ((n == 9 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 100;
                    label.setText(String.valueOf(result));
                }
                break;
            case square:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2) | (n == 3 & listOut.getSelectedItemPosition() == 3) | (n == 4 & listOut.getSelectedItemPosition() == 4) | (n == 5 & listOut.getSelectedItemPosition() == 5) | (n == 6 & listOut.getSelectedItemPosition() == 6) | (n == 7 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.58999;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.58999;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.196e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.196e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.076e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.076e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.55e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.55e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 100;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 100;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 247.105;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) / 247.105;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.59e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.59e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.19599;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.19599;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 10.7639;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 10.7639;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1550;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1550;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 10000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 10000;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 4046.86;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) * 4046.86;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 3.098e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 3.098e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.788e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.788e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 4.014e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 4.014e+9;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 258.999;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) * 258.999;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 640;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 640;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 9;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 9;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1296;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1296;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 11959.9;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 11959.9;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 3)) {
                    double result = Double.parseDouble(field.getText().toString()) * 4840;
                    label.setText(String.valueOf(result));
                } else if ((n == 3 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 4840;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) / 144;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 144;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 107639;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 107639;
                    label.setText(String.valueOf(result));
                } else if ((n == 4 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 43560;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 4)) {
                    double result = Double.parseDouble(field.getText().toString()) * 43560;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.55e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.55e+7;
                    label.setText(String.valueOf(result));
                } else if ((n == 5 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) / 6.273e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 5)) {
                    double result = Double.parseDouble(field.getText().toString()) * 6.273e+6;
                    label.setText(String.valueOf(result));
                } else if ((n == 6 & listOut.getSelectedItemPosition() == 7)) {
                    double result = Double.parseDouble(field.getText().toString()) * 2.47105;
                    label.setText(String.valueOf(result));
                } else if ((n == 7 & listOut.getSelectedItemPosition() == 6)) {
                    double result = Double.parseDouble(field.getText().toString()) / 2.47105;
                    label.setText(String.valueOf(result));
                }
                break;
            case power:
                if ((n == 0 & listOut.getSelectedItemPosition() == 0) | (n == 1 & listOut.getSelectedItemPosition() == 1) | (n == 2 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString());
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1000;
                    label.setText(String.valueOf(result));
                } else if ((n == 0 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) / 735.499;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 0)) {
                    double result = Double.parseDouble(field.getText().toString()) * 735.499;
                    label.setText(String.valueOf(result));
                } else if ((n == 1 & listOut.getSelectedItemPosition() == 2)) {
                    double result = Double.parseDouble(field.getText().toString()) * 1.35962;
                    label.setText(String.valueOf(result));
                } else if ((n == 2 & listOut.getSelectedItemPosition() == 1)) {
                    double result = Double.parseDouble(field.getText().toString()) / 1.35962;
                    label.setText(String.valueOf(result));
                }
          }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_inform:converte(spinner_inform1, spinner_inform2, textView_inform, editText_inform);
                break;
            case R.id.button_speed:converte(spinner_speed1,spinner_speed2,textView_speed,editText_speed);
                break;
            case R.id.button_cpu:converte(spinner_cpu1,spinner_cpu2,textView_cpu,editText_cpu);
                break;
            case R.id.button_temperature:converte(spinner_temperature1,spinner_temperature2,textView_temperature,editText_temperature);
                break;
            case R.id.button_mass:converte(spinner_mass1,spinner_mass2,textView_mass,editText_mass);
                break;
            case R.id.button_lenght:converte(spinner_lenght1,spinner_lenght2,textView_lenght,editText_lenght);
                break;
            case R.id.button_time:converte(spinner_time1,spinner_time2,textView_time,editText_time);
                break;
            case R.id.button_square:converte(spinner_square1,spinner_square2,textView_square,editText_square);
                break;
            case R.id.button_power:converte(spinner_power1,spinner_power2,textView_power,editText_power);
                break;
        }
    }
}
