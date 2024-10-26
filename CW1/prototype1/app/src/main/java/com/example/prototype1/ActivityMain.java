package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Handle login button click
        Button loginButton = findViewById(R.id.login_button); //gets button
        loginButton.setOnClickListener(new View.OnClickListener() { //sets it to click
            @Override
            public void onClick(View v) { //when clicked..
                // Navigate to the status page
                Intent intent = new Intent(ActivityMain.this, ActivityStatus.class);
                startActivity(intent); //starts activity
                overridePendingTransition(0, 0); //smoother transition
                finish();

            }
        });
    }
}











