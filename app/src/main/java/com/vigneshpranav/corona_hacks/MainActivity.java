package com.vigneshpranav.corona_hacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button STEMButton;
    private Button HSButton;
    private Button PAButton;
    private Button VAButton;
    private Button LSButton;
    private Button HFButton;
    private Button continueButton;
    private Spinner spinner;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;
    private static final String[] levels = {"Beginner", "Intermediate", "Advanced"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        STEMButton = (Button) findViewById(R.id.STEMButton);
        HSButton = (Button) findViewById(R.id.HumanitiesButton);
        PAButton = (Button) findViewById(R.id.PerformingArtsButton);
        VAButton = (Button) findViewById(R.id.VisualArtsButton);
        LSButton = (Button) findViewById(R.id.LifeSkillsButton);
        HFButton = (Button) findViewById(R.id.HealthFitnessButton);
        continueButton = (Button) findViewById(R.id.continueButton);

        STEMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(STEMButton.isSelected()){
                    STEMButton.setSelected(false);
                }else{
                    STEMButton.setSelected(true);
                }
            }
        });


        HSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(HSButton.isSelected()){
                    HSButton.setSelected(false);
                }else{
                    HSButton.setSelected(true);
                }            }
        });

        PAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(PAButton.isSelected()){
                    PAButton.setSelected(false);
                }else{
                    PAButton.setSelected(true);
                }            }
        });

        VAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(VAButton.isSelected()){
                    VAButton.setSelected(false);
                }else{
                    VAButton.setSelected(true);
                }            }
        });

        LSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(LSButton.isSelected()){
                    LSButton.setSelected(false);
                }else{
                    LSButton.setSelected(true);
                }            }
        });

        HFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(HFButton.isSelected()){
                    HFButton.setSelected(false);
                }else{
                    HFButton.setSelected(true);
                }            }
        });

        spinner = (Spinner)findViewById(R.id.STEMspinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        spinner2 = (Spinner)findViewById(R.id.Humanitiesspinner);
        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        spinner3 = (Spinner)findViewById(R.id.PerformingArtsSpinner);
        ArrayAdapter<String>adapter3 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);

        spinner4 = (Spinner)findViewById(R.id.VisualArtsSpinner);
        ArrayAdapter<String>adapter4 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(this);

        spinner5 = (Spinner)findViewById(R.id.LifeSkillsSpinner);
        ArrayAdapter<String>adapter5 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(this);

        spinner6 = (Spinner)findViewById(R.id.HealthFitnessSpinner);
        ArrayAdapter<String>adapter6 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,levels);

        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
        spinner6.setOnItemSelectedListener(this);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!STEMButton.isSelected() && !HSButton.isSelected() && !PAButton.isSelected() && !VAButton.isSelected() && !LSButton.isSelected() && !HFButton.isSelected()){
                    Toast.makeText(MainActivity.this, "Select a subject", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, RecommendedActivity.class);
                    startActivity(intent);
                }
            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }




}
