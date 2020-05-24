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

public class HFActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hf);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.hfSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HFActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        //Sample item for Health and Fitness
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));
        items.add(new Item(3, "Advanced Calesthenics Program by THENX", "Health and Fitness", "Anytime", 134.99));




        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
