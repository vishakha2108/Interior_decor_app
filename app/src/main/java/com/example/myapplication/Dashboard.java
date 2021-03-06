package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    Button b2;
    RadioGroup rg2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        b2 = findViewById(R.id.button12);
        rg2 = findViewById(R.id.radioGroup2);



        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int option2 = (Integer)rg2.getCheckedRadioButtonId();
                Intent explicitIntent;

                switch (option2) {
                    case R.id.opt_plants:
                        explicitIntent =  new Intent(Dashboard.this, MainActivity.class);
                        startActivity(explicitIntent);
                        break;

                    case R.id.opt_lights:
                        explicitIntent =  new Intent(Dashboard.this, Lights.class);
                        startActivity(explicitIntent);
                        break;

                    case R.id.opt_furniture:
                        explicitIntent = new Intent(Dashboard.this,Furniture.class);
                        startActivity(explicitIntent);
                        break;
                }

            }

        });
    }

}
