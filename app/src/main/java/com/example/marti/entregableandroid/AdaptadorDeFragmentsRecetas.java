package com.example.marti.entregableandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by marti on 10/21/2016.
 */

public class AdaptadorDeFragmentsRecetas extends FragmentStatePagerAdapter {


    String nombre;
    ArrayList<String> listaDeIngredientes;
    String descripcion;

    public AdaptadorDeFragmentsRecetas(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
