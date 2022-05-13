package com.example.project_clubs_dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityAddEvent extends AppCompatActivity {

    EditText eventNameET,eventDescET,eventVenueET,eventDateET;
    Button addEvent;
    public ArrayList<com.example.project_clubs_dashboard.AddEventModelClass> addEventModelClassesAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        addEvent = findViewById(R.id.addEvent);
        eventNameET=(EditText)findViewById(R.id.eventNameET);
        eventDescET=(EditText)findViewById(R.id.eventDescET);
        eventVenueET=(EditText)findViewById(R.id.eventVenueET);
        eventDateET=(EditText)findViewById(R.id.eventDateET);

        addEventModelClassesAL=new ArrayList<>();

        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.project_clubs_dashboard.AddEventModelClass addEventModelClass=new com.example.project_clubs_dashboard.AddEventModelClass();
                addEventModelClass.setEventName(eventNameET.getText().toString());
                addEventModelClass.setEventDesc(eventDescET.getText().toString());
                addEventModelClass.setEventVenue(eventVenueET.getText().toString());
                addEventModelClass.setEventDate(eventDateET.getText().toString());

                addEventModelClassesAL.add(addEventModelClass);
                Toast.makeText(ActivityAddEvent.this, "Event Added Succesfully !!", Toast.LENGTH_SHORT).show();

            }
        });


    }
}