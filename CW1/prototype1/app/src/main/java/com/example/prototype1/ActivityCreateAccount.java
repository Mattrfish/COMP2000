package com.example.prototype1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_createaccount);

        // login button
        Button loginButton = findViewById(R.id.create_button); //gets button
        loginButton.setOnClickListener(new View.OnClickListener() { //sets it to click
            @Override
            public void onClick(View v) { //when clicked..
                // Navigate from login to status page
                Intent intent = new Intent(ActivityCreateAccount.this, ActivityStatus.class);
                startActivity(intent); //starts activity
                overridePendingTransition(0, 0); //smoother transition
                finish();

            }
        });

        //back to login button
        TextView loginBack = (TextView)findViewById(R.id.login_back);
        loginBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate from create account to login
                Intent intent = new Intent(ActivityCreateAccount.this, ActivityMain.class);
                startActivity(intent); //starts activity
                overridePendingTransition(0, 0); //smoother transition
                finish();
            }
        });
    }
}