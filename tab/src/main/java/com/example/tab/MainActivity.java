package com.example.tab;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = findViewById(R.id.host);
        host.setup();

        TabHost.TabSpec spec;
        spec = host.newTabSpec("tab1");
//        spec.setIndicator("첫번째");
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon1, null));
        spec.setContent(R.id.content1);
        host.addTab(spec);


        spec = host.newTabSpec("tab1");
//        spec.setIndicator("두번째");
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon2, null));
        spec.setContent(R.id.content1);
        host.addTab(spec);

        spec = host.newTabSpec("tab1");
//        spec.setIndicator("세번째");
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon3, null));
        spec.setContent(R.id.content1);
        host.addTab(spec);

    }
}
