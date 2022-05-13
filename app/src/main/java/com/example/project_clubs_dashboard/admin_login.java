package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_login extends AppCompatActivity {

    Button btnsignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        btnsignIn = (Button) findViewById(R.id.buttonsignin);

        btnsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_login.this, activity_admin_landing.class));
            }
        });

    }
}