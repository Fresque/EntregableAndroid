package com.example.marti.entregableandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by marti on 10/17/2016.
 */

public class RestaurantFragment extends Fragment {



    public static RestaurantFragment nuevoFragment(int imagenRestaurant, String nombreRestaurant, String ciudadRestaurant){

        RestaurantFragment fragment = new RestaurantFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("foto", imagenRestaurant);
        bundle.putString("nombre", nombreRestaurant);
        bundle.putString("ciudad", ciudadRestaurant);

        fragment.setArguments(bundle);

        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View fragmentView = inflater.inflate(R.layout.viewpager_fragment_layout, container, false);
        Bundle bundle = getArguments();
        int foto = bundle.getInt("foto");
        String nombre = bundle.getString("nombre");
        String ciudad = bundle.getString("ciudad");

        ImageView contenedorFoto = (ImageView) fragmentView.findViewById(R.id.contenedorFotoRestaurant);
        TextView contenedorNombre = (TextView) fragmentView.findViewById(R.id.restaurant);
        TextView contenedorCiudad = (TextView)fragmentView.findViewById(R.id.ciudad);
        contenedorFoto.setImageResource(foto);
        contenedorNombre.setText(nombre);
        contenedorCiudad.setText(ciudad);

        return fragmentView;
    }
}
