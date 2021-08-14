package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Furniture extends AppCompatActivity {

    String [] names = new String[] {"GRÖNLID, Leather Sofa", "MALM, Standing Desk", "TEODORES, Chair",
            "SLATTUM, Bed Frame", "KLEPPSTAD, Wardrobe"};
    String [] links = new String[] {
            "https://www.ikea.com/in/en/p/groenlid-4-seat-sofa-with-chaise-longue-kimstad-dark-brown-s09307656/",
            "https://www.ikea.com/in/en/p/malm-desk-white-50361754/",
            "https://www.ikea.com/in/en/p/teodores-chair-light-turquoise-90455897/",
            "https://www.ikea.com/in/en/p/slattum-upholstered-bed-frame-knisa-light-grey-40446377/",
            "https://www.ikea.com/in/en/p/kleppstad-wardrobe-with-sliding-doors-white-30437241/"};

    Button b_sofa, b_chair, b_desk, b_bed, b_wardrobe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        b_sofa = findViewById(R.id.button_sofa);
        b_chair = findViewById(R.id.button_chair);
        b_bed = findViewById(R.id.button_bed);
        b_desk = findViewById(R.id.button_desk);
        b_wardrobe = findViewById(R.id.button_wardrobe);

        b_sofa.setText(names[0]);
        b_chair.setText(names[1]);
        b_bed.setText(names[2]);
        b_desk.setText(names[3]);
        b_wardrobe.setText(names[4]);

        b_sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[0]));
                startActivity(implicitIntent);
            }
        });

        b_chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[1]));
                startActivity(implicitIntent);
            }
        });

        b_bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[2]));
                startActivity(implicitIntent);
            }
        });

        b_desk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[3]));
                startActivity(implicitIntent);
            }
        });

        b_wardrobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(links[4]));
                startActivity(implicitIntent);
            }
        });
    }
}
