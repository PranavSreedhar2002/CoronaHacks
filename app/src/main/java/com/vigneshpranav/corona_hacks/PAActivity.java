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

public class PAActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.paSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PAActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        //Sample items for Performing Arts
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));
        items.add(new Item(2, "Course on Reading Music Notes by Udemy", "Performing Arts", "Anytime", "9.99"));



        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
