package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button GetList;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetList = findViewById(R.id.button2);
        rg = findViewById(R.id.RadioGroup);

        GetList.setOnClickListener( new View.OnClickListener(){
                public void onClick(View v){
                    int option = rg.getCheckedRadioButtonId();
                    Intent explicitIntent =  new Intent(MainActivity.this,PlantDetails.class);
                    explicitIntent.putExtra("option",option );
                    startActivity(explicitIntent);
                }

        });

    }
}