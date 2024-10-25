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
        Button requestButton = findViewById(R.id.request_button);
        requestButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Navigate to the status page
                Intent intent = new Intent(ActivityStatus.this, RequestActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();

            }
        });

        // Initialize the BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set the selected item to 'status' so it stays highlighted
        bottomNavigationView.setSelectedItemId(R.id.status);


        // Implement if/else logic for navigation
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.details) {
                Intent intent = new Intent(ActivityStatus.this, DetailsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;
            } else if (id == R.id.settings) {
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


