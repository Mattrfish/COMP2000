package com.example.prototype1;

import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_status);

        // Handle request button click
        Button requestButton = findViewById(R.id.request_button); //gets button
        requestButton.setOnClickListener(new View.OnClickListener() { //sets button click

            @Override
            public void onClick(View v) { //when clicked...
                Intent intent = new Intent(ActivityStatus.this, RequestActivity.class);
                startActivity(intent); //start activity
                overridePendingTransition(0, 0);
                finish();

            }
        });

        // Initialize the BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation); //gets menu bar

        // Set the selected item to 'status' so it stays highlighted
        bottomNavigationView.setSelectedItemId(R.id.status);


        // Implement if/else logic for navigation (case wouldnt work)
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.details) { //if button is details..
                Intent intent = new Intent(ActivityStatus.this, DetailsActivity.class);
                startActivity(intent); //start activity
                overridePendingTransition(0, 0); //smooth transition
                finish();
                return true;
            } else if (id == R.id.settings) { //if button is settings
                Intent intent = new Intent(ActivityStatus.this, SettingsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;
            }
            return true;  // Always return true to mark item as selected
        });
    }
}


