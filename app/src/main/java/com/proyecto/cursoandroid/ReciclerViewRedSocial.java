package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.proyecto.cursoandroid.fuente.Publicacion;
import com.proyecto.cursoandroid.fuente.Usuario;

import java.util.ArrayList;

public class ReciclerViewRedSocial extends AppCompatActivity {

    RecyclerView contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler_view_red_social);

        contenedor = findViewById(R.id.contenedor);

        ArrayList<Publicacion> lista = new ArrayList<>();
        lista.add(new Publicacion(1,"Titulo de la noticia numero 1","Resumen de la noticia numero 1",R.drawable.lugar1,new Usuario(1,"Carlos Giovanni Zarate Ruiz",R.drawable.usurio1)));
        lista.add(new Publicacion(2,"Titulo de la noticia numero 2","Resumen de la noticia numero 2",R.drawable.lugar2,new Usuario(2,"Juana Fariña",R.drawable.usuario2)));
        lista.add(new Publicacion(3,"Titulo de la noticia numero 3","Resumen de la noticia numero 3",R.drawable.lugar3,new Usuario(3,"Esther Ruiz",R.drawable.usuario3)));
        lista.add(new Publicacion(4,"Titulo de la noticia numero 4","Resumen de la noticia numero 4",R.drawable.lugar4,new Usuario(4,"Ignacio Zarate Ruiz",R.drawable.usuario4)));
        lista.add(new Publicacion(5,"Titulo de la noticia numero 5","Resumen de la noticia numero 5",R.drawable.lugar5,new Usuario(5,"Gloria Celeste Ruiz",R.drawable.usuario5)));

        //NO VA A PRESENTAR CAMBIO A LO QUE ES LA INTERFAZ
        contenedor.setHasFixedSize(true);

        LinearLayoutManager miLayout = new LinearLayoutManager(getApplicationContext());
        miLayout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new AdaptadorRedSocial(lista));
        contenedor.setLayoutManager(miLayout);

    }
}
