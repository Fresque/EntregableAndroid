package com.example.marti.entregableandroid;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by marti on 10/17/2016.
 */

public class AdaptadorDeRecyclerView extends RecyclerView.Adapter{

    private List<Receta> listaDeRecetas;
    private Context unContext;
    private View.OnClickListener listener;

    public AdaptadorDeRecyclerView (Context unContext){
        this.unContext = unContext;
        listaDeRecetas = new ArrayList<>();

        listaDeRecetas.add(new Receta("Milanesas a la napolitana0"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana1"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana2"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana3"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana4"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana5"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana6"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana7"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana8"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana9"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana10"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana11"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana12"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana13"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana14"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana15"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana16"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana17"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana18"));
        listaDeRecetas.add(new Receta("Milanesas a la napolitana19"));

    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)unContext.getSystemService(unContext.LAYOUT_INFLATER_SERVICE);
        View viewDeLaCelda = inflater.inflate(R.layout.layout_celda_receta,parent,false);
        viewDeLaCelda.setOnClickListener(listener);
        RecetasViewHolder holderDeLaCelda = new RecetasViewHolder(viewDeLaCelda);

        return holderDeLaCelda;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetasViewHolder holderDeRecetas = (RecetasViewHolder) holder;
        holderDeRecetas.bindearReceta(unaReceta);
    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    public void setListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public Receta devolverReceta(int posicion){
        return listaDeRecetas.get(posicion);
    }

    private static class RecetasViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNombreReceta;

        public RecetasViewHolder(View view){
            super(view);
            textViewNombreReceta = (TextView) view.findViewById(R.id.textViewNombreReceta);
        }

        public void bindearReceta(Receta unaReceta){
            textViewNombreReceta.setText(unaReceta.getNombre());
        }
    }

}
