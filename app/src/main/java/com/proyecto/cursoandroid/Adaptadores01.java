package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class Adaptadores01 extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptadores01);

        listaDatos = findViewById(R.id.lstDatos);

        //CARGA ARRAY LIST
        lista = new ArrayList<Datos>();

        lista.add(new Datos(1,"Oso","Animal en peligro de morir",R.drawable.ic_launcher_background));
        lista.add(new Datos(1,"Elefante","Animal en peligro de morir por grande",R.drawable.elefante));
        lista.add(new Datos(1,"Oso","Animal en peligro de morir",R.drawable.oso));
        lista.add(new Datos(1,"Elefante","Animal en peligro de morir por grande",R.drawable.elefante));
        lista.add(new Datos(1,"Oso","Animal en peligro de morir",R.drawable.oso));
        lista.add(new Datos(1,"Elefante","Animal en peligro de morir por grande",R.drawable.elefante));
        lista.add(new Datos(1,"Oso","Animal en peligro de morir",R.drawable.oso));
        lista.add(new Datos(1,"Elefante","Animal en peligro de morir por grande",R.drawable.elefante));
        lista.add(new Datos(1,"Oso","Animal en peligro de morir",R.drawable.oso));
        lista.add(new Datos(1,"Elefante","Animal en peligro de morir por grande",R.drawable.elefante));


        //CREAR EL ADAPTER
        Adaptador miadaptador = new Adaptador(getApplicationContext(),lista);
        listaDatos.setAdapter(miadaptador);

        //evento al presionar click que haga algo
        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //capturar el objeto seleccionado de la lista de item
                Datos obj = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(),Adaptadores01Detalle.class);
                paso.putExtra("objeto", (Serializable) obj);
                startActivity(paso);
            }
        });
    }
}
