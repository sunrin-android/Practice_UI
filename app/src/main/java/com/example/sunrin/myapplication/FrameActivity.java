package com.example.sunrin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {

    ImageView image1, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
    }

    public void onImg1Clicked(View v){
        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.VISIBLE);
    }
    public void onImg2Clicked(View v){
        image1.setVisibility(View.VISIBLE);
        image2.setVisibility(View.INVISIBLE);
    }
}
