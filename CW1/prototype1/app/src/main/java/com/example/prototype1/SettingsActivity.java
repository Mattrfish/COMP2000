package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_settings);

        // Initialize the BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.settings);

        //case would not work so had to implement if/else instead
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.status) {
                Intent intent = new Intent(SettingsActivity.this, ActivityStatus.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;

            } else if (id == R.id.details) {
                Intent intent = new Intent(SettingsActivity.this, DetailsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;

            }
            return true;
        });



    }
}
