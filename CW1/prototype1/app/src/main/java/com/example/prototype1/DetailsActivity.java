package com.example.prototype1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_details);

        Button editButton = findViewById(R.id.edit_button); // gets the button

// List of all EditText fields to toggle
        int[] editableTextIds = {
                R.id.Title_data, R.id.Fn_data, R.id.Sn_data, R.id.Pass_data,
                R.id.Dob_data, R.id.Address_data, R.id.Mn_data, R.id.Jr_data
        };

// Fields to set as permanently non-editable
        int[] nonEditableTextIds = {
                R.id.id_data, R.id.Email_data, R.id.Salary_data
        };

// Set permanently non-editable fields
        for (int id : nonEditableTextIds) {
            EditText editText = findViewById(id);
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        }

// Initially set editable fields as non-editable
        for (int id : editableTextIds) {
            EditText editText = findViewById(id);
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        }

// Toggle button to switch between Edit and Save modes
        editButton.setOnClickListener(new View.OnClickListener() {
            private boolean isEditMode = false;

            @Override
            public void onClick(View v) {
                if (!isEditMode) {
                    // Entering Edit mode
                    for (int id : editableTextIds) {
                        EditText editText = findViewById(id);
                        editText.setFocusable(true);
                        editText.setFocusableInTouchMode(true);
                    }
                    editButton.setText("Save"); // Change button text to "Save"
                    isEditMode = true; // Update mode

                } else {
                    // Save mode: Save the details here if needed
                    for (int id : editableTextIds) {
                        EditText editText = findViewById(id);
                        editText.setFocusable(false);
                        editText.setFocusableInTouchMode(false);

                        // Optional: Retrieve the text from editText for saving
                        String text = editText.getText().toString();
                        // Code to save 'text' goes here
                    }
                    editButton.setText("Edit"); // Change button text back to "Edit"
                    isEditMode = false; // Update mode
                }
            }
        });




        // Initialize the BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation); //nav bar
        bottomNavigationView.setSelectedItemId(R.id.details);

        //case would not work so had to implement if/else instead
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.status) { //if status clicked...
                Intent intent = new Intent(DetailsActivity.this, ActivityStatus.class);
                startActivity(intent); //start activity
                overridePendingTransition(0, 0);
                finish();
                return true;
            } else if (id == R.id.settings) { //if settings..
                Intent intent = new Intent(DetailsActivity.this, SettingsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
                return true;
            }
            return true;
        });

    }
}





