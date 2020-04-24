package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ReciclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler_view);

        ArrayList<ReciclerViewFuente> lista = new ArrayList<>();
        lista.add(new ReciclerViewFuente("Imagen Numero 1",R.drawable.lugar1,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 2",R.drawable.lugar2,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 3",R.drawable.lugar3,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 4",R.drawable.lugar4,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 5",R.drawable.lugar5,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 6",R.drawable.lugar6,0));
        lista.add(new ReciclerViewFuente("Imagen Numero 7",R.drawable.lugar7,0));

        ///
        RecyclerView contenedor = findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new ReciclerViewAdaptador(lista));
        contenedor.setLayoutManager(layout);

    }
}
