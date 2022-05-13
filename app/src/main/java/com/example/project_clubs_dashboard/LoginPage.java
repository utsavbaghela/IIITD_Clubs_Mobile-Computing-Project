package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    Button clubAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        clubAdmin = (Button) findViewById(R.id.button2);

        clubAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, admin_login.class );
                startActivity(i);
            }
        });


    }

    public void gotoStudentLoginPage(View v)
    {
        Intent i = new Intent(this, studentLoginActivity.class);
        startActivity(i);
    }

    public void gotoStudentRegistrationPage(View v)
    {

        Intent i2 = new Intent(this, registrationActivity.class);
        startActivity(i2);
    }
    public void gotoStudentforgotpasswordPage(View v)
    {
        Intent i3 = new Intent(getApplicationContext(), forgotpasswordActivity.class);
        startActivity(i3);
    }

}