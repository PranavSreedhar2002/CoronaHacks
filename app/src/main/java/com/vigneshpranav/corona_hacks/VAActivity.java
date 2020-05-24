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

public class VAActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_va);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.vaSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VAActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();


        //Sample items for Visual Arts
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));
        items.add(new Item(2, "Photoshop Training by Adobe", "Visual Arts", "Anytime", "Subscription Required"));


        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
