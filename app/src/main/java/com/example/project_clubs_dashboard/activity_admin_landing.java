package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_admin_landing extends AppCompatActivity {

    Button newAdmin, deleteEvent, addEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_landing);

        newAdmin = findViewById(R.id.buttonNewAdmin);
        deleteEvent = findViewById(R.id.buttonDeleteEvent);
        addEvent = findViewById(R.id.buttonAddEvent);

        newAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(activity_admin_landing.this, ActivityNewAdminRegistration.class);
                startActivity(i);
            }
        });


        deleteEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(activity_admin_landing.this, Activity_DeleteEvent.class);
                startActivity(j);
            }
        });

        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(activity_admin_landing.this, ActivityAddEvent.class);
                startActivity(j);
            }
        });




    }
}