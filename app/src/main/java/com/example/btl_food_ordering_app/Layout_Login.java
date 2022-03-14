package com.example.btl_food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class Layout_Login extends AppCompatActivity {

    ImageView sun;
    View daySky,nightSky;
    DayNightSwitch dayNightSwitch;

    void Connect_ID()
    {
        sun=findViewById(R.id.sun);
        daySky=findViewById(R.id.day_BackGround);
        nightSky=findViewById(R.id.night_BackGround);
        dayNightSwitch=findViewById(R.id.day_night_switch);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_login);
        Connect_ID();
        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean is_night) {
                if(is_night)
                {
                    sun.animate().translationY(70).setDuration(1000);
                    daySky.animate().alpha(0).setDuration(1300);
                }
                else
                {
                    sun.animate().translationY(-20).setDuration(1000);
                    daySky.animate().alpha(1).setDuration(1300);
                }
            }
        });
    }
}