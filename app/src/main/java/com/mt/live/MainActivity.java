package com.mt.live;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LiveViewFragment mLiveViewF = new LiveViewFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flmain,mLiveViewF).commit();

    }
}
