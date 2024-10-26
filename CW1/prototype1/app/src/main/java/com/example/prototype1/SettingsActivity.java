package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

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

        // logout button
        Button logoutButton = findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Inflate the layout of the popup window
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.layout_logout_popup, null);

                // Create the popup window
                int width = LinearLayout.LayoutParams.MATCH_PARENT;
                int height = LinearLayout.LayoutParams.MATCH_PARENT;
                boolean focusable = true;
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

                // Show the popup window
                popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

                // Find the Yes and No buttons in the popup
                Button yesButton = popupView.findViewById(R.id.yes_button);
                Button noButton = popupView.findViewById(R.id.no_button);

                // No button to dismiss the popup
                noButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss(); // Dismiss the popup
                    }
                });

                // Yes button to go back to login page
                yesButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss(); // Dismiss the popup

                        // go to login page
                        Intent intent = new Intent(SettingsActivity.this, ActivityMain.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        // Set up Bottom menu
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.status) { //when status clicked...
                Intent intent = new Intent(SettingsActivity.this, ActivityStatus.class);
                startActivity(intent);
                overridePendingTransition(0, 0); //smoother transition
                finish();
                return true;

            } else if (id == R.id.details) { //when details clicked...
                Intent intent = new Intent(SettingsActivity.this, DetailsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0); //smoother transition
                finish();
                return true;
            }
            return true;
        });
    }
}
