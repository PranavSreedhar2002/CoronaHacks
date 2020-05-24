package com.vigneshpranav.corona_hacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class STEMActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stem);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.stemSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(STEMActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Python for Beginners by Codecademy", "STEM", "Anytime", 0.00));
        items.add(new Item(1, "Intro to Physics by Khan Academy", "STEM", "Anytime", 0.00));
        items.add(new Item(2, "24hr Hackathon by New Reality Summit", "STEM", "May 23-25, 2020", 12.99));
        items.add(new Item(2, "Article on New STEM cell findings by New Scientist", "STEM", "Anytime", "Subscription Required"));
        items.add(new Item(3, "UPenn Lab Report on Enzyme Catalysis by Candice Randolph", "STEM", "Anytime", 0.00));
        items.add(new Item(3, "Advanced Circuit Logic Summer Course by Cornell University", "STEM", "July-August", 399.00));




        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
