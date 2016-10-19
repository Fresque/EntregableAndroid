package com.example.marti.entregableandroid;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by marti on 10/15/2016.
 */

public class RestaurantViewPagerActivity extends AppCompatActivity {

    ViewPager viewPager = null;
    AdaptadorDeFragments adaptadorDeFragments;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        AdaptadorDeFragments adapter = new AdaptadorDeFragments(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }

}
