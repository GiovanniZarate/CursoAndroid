package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridView01Detalle extends AppCompatActivity {

    ImageView imagen;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view01_detalle);

        imagen = findViewById(R.id.imageviewdeta);
        texto = findViewById(R.id.TextView);

        GridView01Datos obj = (GridView01Datos) getIntent().getExtras().getSerializable("objeto");
        imagen.setImageResource(obj.getImagen());
        texto.setText(obj.getTitulo().toString());
    }
}
