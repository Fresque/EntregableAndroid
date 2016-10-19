package com.example.marti.entregableandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecetasRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recetas_recycler_view);

        RecyclerView recyclerRecetas = (RecyclerView) findViewById(R.id.recyclerViewRecetas);
        recyclerRecetas.setHasFixedSize(true);
        AdaptadorDeRecyclerView unAdaptador = new AdaptadorDeRecyclerView(this);
        recyclerRecetas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerRecetas.setAdapter(unAdaptador);

    }


}
