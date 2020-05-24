package com.vigneshpranav.corona_hacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RecommendedActivity extends AppCompatActivity {

    private Button forumButton;
    private Button exploreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);

        forumButton = (Button) findViewById(R.id.forum);
        exploreButton = (Button) findViewById(R.id.explore);

        forumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/GvuHRA3"));
                startActivity(browserIntent);
            }
        });

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecommendedActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(3, "Seminar on Groundbreaking AI Research by Stanford Professor", "STEM", "May 29, 2020", 0.00));
        items.add(new Item(3, "Course on Discrete Mathematics by Coursera", "STEM", "June-July", 199.99));
        items.add(new Item(1, "YouTube Guitar Lessons by Andy Guitar", "Performing Arts", "Anytime", 0.00));
        items.add(new Item(1, "Udemy Improv Lessons", "Performing Arts", "Anytime", 14.99));
        items.add(new Item(1, "Youtube Pantry Recipe Tutorials by Binging with Babish", "Life Skills", "Anytime", 0.00));
        items.add(new Item(1, "How To Do Laundry in 10 Easy Steps by The Spruce", "Life Skills", "Anytime", "Subscription required"));
        items.add(new Item(2, "Home Workout App by Leap Fitness Group", "Health and Fitness", "Anytime", 0.00));
        items.add(new Item(2, "30 Day Bodyweight Program by ATHLEAN-X", "Health and Fitness", "July-August", 78.99));




        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        final ListView listView = (ListView) findViewById(R.id.listRecommended);
        listView.setAdapter(itemAdapter);

    }


}
