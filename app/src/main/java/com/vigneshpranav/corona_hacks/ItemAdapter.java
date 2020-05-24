package com.vigneshpranav.corona_hacks;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

;


public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);
        View listItemView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        // Lookup view for data population
        TextView level = (TextView) listItemView.findViewById(R.id.level);
        TextView courseSubject = (TextView) listItemView.findViewById(R.id.cs);
        TextView courseName = (TextView) listItemView.findViewById(R.id.cn);
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        TextView cost = (TextView) listItemView.findViewById(R.id.cost);
        // Populate the data into the template view using the data object
        if (item.getLevel() == 1) {
            level.setText("B");
        }
        else if (item.getLevel() == 2) {
            level.setText("I");
        }
        else {
            level.setText("A");
        }

        courseSubject.setText(item.getSubject());
        courseName.setText(item.getName());
        date.setText(item.getDate());
        cost.setText(item.getCost());

        GradientDrawable levelCircle = (GradientDrawable) level.getBackground();
        int levelColor = getLevelColor(item.getLevel());
        levelCircle.setColor(levelColor);

        return listItemView;



    }

    private int getLevelColor(int level) {
        int color = 0;
        switch (level) {
            case 1:
                color = R.color.beginner;
                break;
            case 2:
                color = R.color.intermediate;
                break;
            case 3:
                color = R.color.advanced;
                break;
            default:
                color = R.color.courseSubject;
                break;
        }
        return ContextCompat.getColor(getContext(), color);
    }
}
