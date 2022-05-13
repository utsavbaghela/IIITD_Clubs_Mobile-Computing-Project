package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class Activity_DeleteEvent extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_event);

        FragmentManager fragmentManagerButton=getSupportFragmentManager();
        FragmentTransaction fragmentTransactionButton=fragmentManagerButton.beginTransaction();
        deleteEventsList DeleteEventsList=new deleteEventsList();
        fragmentTransactionButton.replace(R.id.activityFrame,DeleteEventsList);
        fragmentTransactionButton.commit();

    }
}