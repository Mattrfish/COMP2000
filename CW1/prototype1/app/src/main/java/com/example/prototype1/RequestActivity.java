package com.example.prototype1;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;



public class RequestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_request);

        Button confirmButton = findViewById(R.id.confirm_button);
        confirmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { //when confirm is clicked..
                // go to status page (will also save the data in future)
                Intent intent = new Intent(RequestActivity.this, ActivityStatus.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();

            }
        });
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { //when back is clicked
                // go back to the status page (will not save the data)
                Intent intent = new Intent(RequestActivity.this, ActivityStatus.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();

            }
        });


        // Initialize the Bottom menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Implement if/else logic for navigation
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.details) { //if details clicked...
                Intent intent = new Intent(RequestActivity.this, DetailsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;
            } else if (id == R.id.settings) { //if settings button clicked..
                Intent intent = new Intent(RequestActivity.this, SettingsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;
            }
            return true;
        });
    }
}
