package com.aerobola.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        back=findViewById(R.id.image_back);
        back.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view==back) {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
