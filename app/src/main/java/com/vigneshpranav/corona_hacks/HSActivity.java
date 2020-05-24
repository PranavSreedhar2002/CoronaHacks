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

public class HSActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hs);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.hsSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HSActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Intro to French Grammar by Français Facile", "Humanities", "Anytime", 0.00));
        items.add(new Item(1, "Article on Argumentative Essay Structure by SparkNotes", "Humanities", "Anytime", 0.00));
        items.add(new Item(2, "Post-Depression American History course by Coursera", "Humanities", "Anytime", 29.99));
        items.add(new Item(2, "Impact of Coronavirus on World Economy by the Economist", "Humanities", "Anytime", "Subscription Required"));
        items.add(new Item(3, "Literary Analysis of Antigone by Blythe Colina", "Humanities", "Anytime", 0.00));
        items.add(new Item(3, "Seminar Exploring Accuracy of WWI Primary Sources by Princeton Professor", "Humanities", "July 24, 2020", 0.00));


        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
