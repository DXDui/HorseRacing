package com.example.prm_teamproject_carracing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Retrieve the winningHorses list from the intent
        ArrayList<String> winningHorses = getIntent().getStringArrayListExtra("winningHorses");

        // Initialize the ListView and ArrayAdapter
        ListView listView = findViewById(R.id.listViewResults);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, winningHorses);

        // Set the adapter for the ListView
        listView.setAdapter(adapter);
    }
}