package com.example.project_clubs_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Animation topAnim , bottomAnim;
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        img = findViewById(R.id.imageFront);
        txt = findViewById(R.id.txtFront);
        img.setAnimation(topAnim);
        txt.setAnimation(bottomAnim);

        new Handler().postDelayed(()->{
            Intent intent = new Intent(MainActivity.this,LoginPage.class);

            Pair pairs[] = new Pair[2];
            pairs[0]= new Pair<View,String>(img,"logo_img");
            pairs[1]= new Pair<View,String>(txt,"logo_txt");
            ActivityOptions ops = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
            startActivity(intent,ops.toBundle());
            finish();
        },3000);

    }
}