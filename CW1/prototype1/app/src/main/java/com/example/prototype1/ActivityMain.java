package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // login button
        Button loginButton = findViewById(R.id.login_button); //gets button
        loginButton.setOnClickListener(new View.OnClickListener() { //sets it to click
            @Override
            public void onClick(View v) { //when clicked..
                // Navigate from login to status page
                Intent intent = new Intent(ActivityMain.this, ActivityStatus.class);
                startActivity(intent); //starts activity
                overridePendingTransition(0, 0); //smoother transition
                finish();

            }
        });

        //create account button
        TextView account = (TextView)findViewById(R.id.account);
                account.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Navigate from login to create account page
                        Intent intent = new Intent(ActivityMain.this, ActivityCreateAccount.class);
                        startActivity(intent); //starts activity
                        overridePendingTransition(0, 0); //smoother transition
                        finish();
                    }
                });
    }
}











