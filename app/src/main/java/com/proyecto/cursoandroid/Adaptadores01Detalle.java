package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptadores01Detalle extends AppCompatActivity {

    ImageView foto;
    TextView titulo;
    TextView detalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptadores01_detalle);

        foto = findViewById(R.id.imgFoto);
        titulo = findViewById(R.id.txtTitulo);
        detalle = findViewById(R.id.txtDetalle);

        //RECIBIR EL OBJETO SERIALIZADO DEL OTRO ACITVIY
        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        //poner los datos en el detalle
        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());

    }
}
