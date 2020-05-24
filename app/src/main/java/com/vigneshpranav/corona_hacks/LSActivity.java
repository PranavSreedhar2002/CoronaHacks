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

public class LSActivity extends AppCompatActivity {

    private Button exploreButton;
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ls);

        exploreButton = (Button) findViewById(R.id.explore);
        searchText = (EditText) findViewById(R.id.lsSearch);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LSActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        //Sample items for Life Skills
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "Youtube Tutorial on How to Tie a Full Windsor Knot by Tiehole", "Life Skills", "Anytime", 0.00));



        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }
}
