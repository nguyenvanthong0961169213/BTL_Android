package com.example.btl_food_ordering_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout_SignUp extends AppCompatActivity {

    Button btn_backsignin;
    void Connect_ID()
    {
        btn_backsignin=findViewById(R.id.btn_backsignin);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_signup);
        Connect_ID();
        Intent intent_backsignin=new Intent(this,Layout_Login.class);
        btn_backsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent_backsignin);
            }
        });
    }
}