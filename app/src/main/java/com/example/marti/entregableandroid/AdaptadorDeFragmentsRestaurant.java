package com.example.marti.entregableandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 10/15/2016.
 */

public class AdaptadorDeFragmentsRestaurant extends FragmentStatePagerAdapter {

    List<Fragment> listaDeFragments;

    public AdaptadorDeFragmentsRestaurant(FragmentManager fm) {
        super(fm);
        this.listaDeFragments = new ArrayList<Fragment>();

        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.astridygaston, "Astrid y gaston", "Lima, Peru"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.borago, "Borago", "Santiago, Chile"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.central, "Central", "Lima, Peru"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.dom, "D.O.M", "San Pablo, Brasil"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.tegui, "Tegui", "Buenos Aires, Argentina"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.mani, "Mani", "San Pablo, Brasil"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.quintonil, "Quintonil", "Ciudad de Mexico, Mexico"));
        listaDeFragments.add(RestaurantFragment.nuevoFragment(R.drawable.maido, "Maido", "Lima, Peru"));

    }

    @Override
    public Fragment getItem(int position){
        return listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragments.size();
    }
}