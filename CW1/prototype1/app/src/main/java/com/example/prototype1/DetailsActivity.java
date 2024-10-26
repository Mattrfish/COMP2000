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

// List of data to edit. stored in an array for better efficiency
        int[] editableTextIds = {
                R.id.Title_data, R.id.Fn_data, R.id.Sn_data, R.id.Pass_data,
                R.id.Dob_data, R.id.Address_data, R.id.Mn_data, R.id.Jr_data
        };

// list of data in array that can not be changed
        int[] nonEditableTextIds = {
                R.id.id_data, R.id.Email_data, R.id.Salary_data
        };

// Set the non-editable data as permanantly non-editable
        for (int id : nonEditableTextIds) {
            EditText editText = findViewById(id);
            editText.setFocusable(false); //cannot edit
            editText.setFocusableInTouchMode(false);
        }

// Initially set the editable data as non-editable
        for (int id : editableTextIds) {
            EditText editText = findViewById(id);
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        }

// button to switch between Edit and Save modes
        editButton.setOnClickListener(new View.OnClickListener() {
            private boolean isEditMode = false; //initially set to only view

            @Override
            public void onClick(View v) { //when edit button clicked...
                if (!isEditMode) {
                    // Entering Edit mode
                    for (int id : editableTextIds) { //loop through the array to update data to edit mode
                        EditText editText = findViewById(id);
                        editText.setFocusable(true); //edit enabled
                        editText.setFocusableInTouchMode(true);
                    }
                    editButton.setText("Save"); // Change button text to "Save"
                    isEditMode = true; // Update mode

                } else {
                    // enter save mode
                    for (int id : editableTextIds) { //loop through array to turn it back to view only
                        EditText editText = findViewById(id);
                        editText.setFocusable(false);  //edit disabled
                        editText.setFocusableInTouchMode(false);

                    }
                    editButton.setText("Edit"); // Change button text back to Edit
                    isEditMode = false; // Update edit mode back to view
                }
            }
        });




        // Initialize the Bottom menu
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





