package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lights extends AppCompatActivity {

    String [] names = new String[] {"TÄRNABY, Anhtracite Table Lamp", "VIDJA, Floor Lamp", "IKEA PS 2014, Pendant Lamp",
                                    "White Metal Outdoor Wall Light", "Adelia Chandelier"};
    String [] links = new String[] {"https://www.ikea.com/in/en/p/taernaby-table-lamp-anthracite-00323892/",
                                    "https://www.ikea.com/in/en/p/vidja-floor-lamp-white-30313858/",
                                    "https://www.ikea.com/in/en/p/ikea-ps-2014-pendant-lamp-white-copper-colour-60325218/",
                                    "https://www.pepperfry.com/white-metal-outdoor-wall-light-by-eliante-by-jainsons-lights-1864456.html?type=clip&pos=5:1&cat=1598&total_result=119&variation_id=202240",
                                    "https://www.havells.com/en/consumer/lighting/home-art-light/grandeur-theme/adelia-chandelier-1x5ls-e27-abr.html"};

    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        b1 = findViewById(R.id.button7);
        b2 = findViewById(R.id.button8);
        b3 = findViewById(R.id.button9);
        b4 = findViewById(R.id.button10);
        b5 = findViewById(R.id.button11);

        b1.setText(names[0]);
        b2.setText(names[1]);
        b3.setText(names[2]);
        b4.setText(names[3]);
        b5.setText(names[4]);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[0]));
                startActivity(implicitIntent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[1]));
                startActivity(implicitIntent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[2]));
                startActivity(implicitIntent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[3]));
                startActivity(implicitIntent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[4]));
                startActivity(implicitIntent);
            }
        });
    }
}
