package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class clubEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_events);

        FragmentManager fragmentManagerButton=getSupportFragmentManager();
        FragmentTransaction fragmentTransactionButton=fragmentManagerButton.beginTransaction();
        EventListFragmentRV eventListFragmentRV=new EventListFragmentRV();
        fragmentTransactionButton.replace(R.id.activityFrameLayout,eventListFragmentRV);
        fragmentTransactionButton.commit();
    }
}