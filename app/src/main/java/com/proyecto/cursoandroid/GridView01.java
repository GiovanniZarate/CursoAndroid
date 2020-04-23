package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class GridView01 extends AppCompatActivity {

    GridView grilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view01);

        grilla = findViewById(R.id.grilla);

        //CARGA ARRAY LIST
        ArrayList<GridView01Datos>  lista = new ArrayList<GridView01Datos>();

        lista.add(new GridView01Datos(1,R.drawable.ic_launcher_background,"Oso"));
        lista.add(new GridView01Datos(2,R.drawable.ic_launcher_background,"Perro"));
        lista.add(new GridView01Datos(3,R.drawable.ic_launcher_background,"Gato"));
        lista.add(new GridView01Datos(4,R.drawable.ic_launcher_background,"Gaviota"));
        lista.add(new GridView01Datos(5,R.drawable.ic_launcher_background,"Gallina"));
        lista.add(new GridView01Datos(6,R.drawable.ic_launcher_background,"Gallo"));
        lista.add(new GridView01Datos(7,R.drawable.ic_launcher_background,"Paloma"));
        lista.add(new GridView01Datos(8,R.drawable.ic_launcher_background,"Pajaro"));
        lista.add(new GridView01Datos(9,R.drawable.ic_launcher_background,"Panda"));
        lista.add(new GridView01Datos(10,R.drawable.ic_launcher_background,"Paloma"));
        lista.add(new GridView01Datos(11,R.drawable.ic_launcher_background,"Gaviota"));
        lista.add(new GridView01Datos(12,R.drawable.ic_launcher_background,"Gallina"));
        lista.add(new GridView01Datos(13,R.drawable.ic_launcher_background,"Gallo"));
        lista.add(new GridView01Datos(14,R.drawable.ic_launcher_background,"Gaviota"));
        lista.add(new GridView01Datos(15,R.drawable.ic_launcher_background,"Gallina"));
        lista.add(new GridView01Datos(16,R.drawable.ic_launcher_background,"Gallo"));

        GridVeiw01Adaptador miadaptador = new GridVeiw01Adaptador(getApplicationContext(),lista);

        grilla.setAdapter(miadaptador);

        //GESTIONAR EL EVENTO DE LA GRILLA
        grilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GridView01Datos obj = (GridView01Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(),GridView01Detalle.class);
                paso.putExtra("objeto",(Serializable) obj);
                startActivity(paso);
            }
        });
    }
}
