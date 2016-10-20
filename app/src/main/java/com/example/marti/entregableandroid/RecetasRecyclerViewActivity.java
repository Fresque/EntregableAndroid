package com.example.marti.entregableandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class RecetasRecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerRecetas;
    AdaptadorDeRecyclerView unAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recetas_recycler_view);

        recyclerRecetas = (RecyclerView) findViewById(R.id.recyclerViewRecetas);
        recyclerRecetas.setHasFixedSize(true);
        unAdaptador = new AdaptadorDeRecyclerView(this);
        unAdaptador.setListener(new ListenerDeClicks());

        recyclerRecetas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerRecetas.setAdapter(unAdaptador);

    }

    private class ListenerDeClicks implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int posicion = recyclerRecetas.getChildAdapterPosition(v);
            Receta unaReceta = unAdaptador.devolverReceta(posicion);

            Toast.makeText(v.getContext(), "Clickearon " + unaReceta.getNombre(), Toast.LENGTH_LONG).show();


        }
    }


}
