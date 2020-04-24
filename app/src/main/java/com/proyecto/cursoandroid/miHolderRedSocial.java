package com.proyecto.cursoandroid;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class miHolderRedSocial extends RecyclerView.ViewHolder {
    ImageView imagenUsuario;
    ImageView imagenPublicacion;
    TextView textoUsuario;
    TextView titulo;
    TextView resumen;
    Button btnMegusta;
    Button btnComentar;

    public miHolderRedSocial(@NonNull View itemView) {
        super(itemView);

        imagenUsuario = itemView.findViewById(R.id.imagenUsuario);
        textoUsuario = itemView.findViewById(R.id.nombreUsuario);
        titulo = itemView.findViewById(R.id.titulo);
        resumen = itemView.findViewById(R.id.resumen);
        imagenPublicacion = itemView.findViewById(R.id.imagenPublicidad);
        btnMegusta = itemView.findViewById(R.id.btnMegusta);
        btnComentar = itemView.findViewById(R.id.btnComentar);

        btnComentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnMegusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
