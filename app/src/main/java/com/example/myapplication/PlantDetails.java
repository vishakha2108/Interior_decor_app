package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlantDetails extends AppCompatActivity {
    String [] names = new String[]{ "Barberton Daisy","English Ivy","Spider Plant","Aloe Vera","Broad Lady Palm",
                                    "Mums","Golden pothos","Gerbera daisies","Areca palm","Lady palm",
                                    "Moth Orchids","Anthurium","Calla Lilies","Amary llis","Thanksgiving Cactus"};

    String [] Links = new String[]{"https://www.greendecor.in/plant/buy-gerbera-daisy-Plants-online-in-delhi/",
                        "https://www.plantsguru.com/english-Ivy",
                        "https://nurserylive.com/products/chlorophytum-spider-plant-dark-green-1082-plant?gclid=CjwKCAjwsNiIBhBdEiwAJK4khhbvv13wiHD_kdvbVfmUu7lz4JkuaWR-bh26nKFwY8HkykJWyg7c4BoCBz8QAvD_BwE",
                        "https://nurserylive.com/products/aloe-vera-plant?gclid=CjwKCAjwsNiIBhBdEiwAJK4khsWysVdP6K2RM6vdzRqQd-bITz2AHy7cAX1Y2J2AXOvPMS6i5JzxzBoCH2UQAvD_BwE",
                        "https://exoticflora.in/products/rhapis-excelsa-palms?utm_source=adyogi&utm_medium=google-ssc&utm_campaign=EXOT_4487_adyogi_SmartShopping_Prospect",
                        "https://www.growjoy.com/store/pc/Mum-Plants-c92.htm",
                        "https://www.plantsguru.com/money-plant%20-golden-pothos",
                        "https://www.fnp.com/gift/lovely-gerberas-bunch?gclid=CjwKCAjwsNiIBhBdEiwAJK4khhGhOd1SM3WsdrudB9pgH1fem8lYJCB7YXCbvNmN7gKx1TEH7vLh1hoCxAoQAvD_BwE",
                        "https://nurserylive.com/products/areca-palm-plant?gclid=CjwKCAjwsNiIBhBdEiwAJK4khp3wcX-URcNlzlc9eJEtmkW3q_O_VoHfgERMdDZYzfK3aFSM7uiijxoCX2EQAvD_BwE",
                        "https://exoticflora.in/products/rhapis-excelsa-palms?utm_source=adyogi&utm_medium=google-ssc&utm_campaign=EXOT_4487_adyogi_SmartShopping_Prospect",
                        "https://eplants.in/plants/orchid/orchid-phalaenopsis-purple-mini/?utm_term=&utm_campaign=Aglaonema+-+Google+Merchant&utm_source=adwords&utm_medium=ppc&hsa_acc=7333566544&hsa_cam=12341787283&hsa_grp=124370123202&hsa_ad=523677076537&hsa_src=g&hsa_tgt=pla-293946777986&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjwsNiIBhBdEiwAJK4khrPW-neDhuB8fJVCSQ1HN20ITUetHzhIM7yJ90d5WBMVTerSrOWc6hoCoXoQAvD_BwE",
                        "https://nurserylive.com/products/anthurium-andreanum-princess-amalia-elegance-plant?gclid=CjwKCAjwsNiIBhBdEiwAJK4khjyLpRwURdK2IVGueheMS16hLdJNT2W3pWKB85p5p_s17qFzv7BMthoCrc8QAvD_BwE",
                        "https://www.igp.com/p-bunch-of-6-pretty-lilies-64075?currency=inr&utm_source=google&utm_medium=cpc&utm_campaign=8080910876&adgroupid=85995291720&device=c&keyword=&loc_interest_ms=&loc_physical_ms=1007788&feeditemid=&adposition=&gclid=CjwKCAjwsNiIBhBdEiwAJK4khq0fDAfIBf38j7PffHQoiMEhfG__u2AK3Mi0dLRdTB9Nc5uWrf4L5xoCFBEQAvD_BwE",
                        "https://www.plantsguru.com/amaryllis-lily-red-plant",
                        "https://nurserylive.com/products/christmas-cactus-schlumbergera-plant?gclid=CjwKCAjwsNiIBhBdEiwAJK4khqGIAsrBxsDPCV-YlIM5uZbv7_tScv9ZvMBtN-VO5amRu02RPP_BMxoCBS4QAvD_BwE"
    };
    Button button1,button2,button3,button4,button5;
    int append = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_details);
        Bundle extras = getIntent().getExtras();
        int plantcategory = extras.getInt("option");
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button5);button5 = findViewById(R.id.button6);
        switch (plantcategory)
        {
            case 100239:append = 0;
            case 100359:append = 5;
            case 1000131:append = 10;
        }

                button1.setText(names[append+0]);
                button2.setText(names[append+1]);
                button3.setText(names[append+2]);
                button4.setText(names[append+3]);
                button5.setText(names[append+4]);
        button1.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(Links[append+0]));
                startActivity(implicitIntent);
            }

        });
        button2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(Links[append+1]));
                startActivity(implicitIntent);
            }

        });
        button3.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(Links[append+2]));
                startActivity(implicitIntent);
            }

        });
        button4.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(Links[append+3]));
                startActivity(implicitIntent);
            }

        });
        button5.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){

                Intent implicitIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(Links[append+4]));
                startActivity(implicitIntent);
            }

        });

    }
}