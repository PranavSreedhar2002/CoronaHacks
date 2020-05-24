package com.vigneshpranav.corona_hacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity {

    private Button STEMExplore;
    private Button HSExplore;
    private Button PAExplore;
    private Button VAExplore;
    private Button LSExplore;
    private Button HFExplore;
    private Button recommended;
    private Button preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        STEMExplore = (Button) findViewById(R.id.stemExplore);
        HSExplore = (Button) findViewById(R.id.humanitiesExplore);
        PAExplore = (Button) findViewById(R.id.paExplore);
        VAExplore = (Button) findViewById(R.id.vaExplore);
        LSExplore = (Button) findViewById(R.id.lsExplore);
        HFExplore = (Button) findViewById(R.id.hfExplore);
        recommended = (Button) findViewById(R.id.recommendedExplore);
        preferences = (Button) findViewById(R.id.interestExplore);


        STEMExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, STEMActivity.class);
                startActivity(intent);
            }
        });

        HSExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, HSActivity.class);
                startActivity(intent);
            }
        });

        PAExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, PAActivity.class);
                startActivity(intent);
            }
        });

        VAExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, VAActivity.class);
                startActivity(intent);
            }
        });

        LSExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, LSActivity.class);
                startActivity(intent);
            }
        });

        HFExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, HFActivity.class);
                startActivity(intent);
            }
        });


        recommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, RecommendedActivity.class);
                startActivity(intent);
            }
        });

        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
