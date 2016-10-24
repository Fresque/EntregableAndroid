package com.example.marti.entregableandroid;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by marti on 10/15/2016.
 */

public class RestaurantViewPagerActivity extends AppCompatActivity {

    ViewPager viewPager = null;
    AdaptadorDeFragmentsRestaurant adaptadorDeFragmentsRestaurant;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        AdaptadorDeFragmentsRestaurant adapter = new AdaptadorDeFragmentsRestaurant(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }

}
