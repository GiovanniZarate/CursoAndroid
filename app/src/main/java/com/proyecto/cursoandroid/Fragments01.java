package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragments01 extends AppCompatActivity {

    Button btnuno;
    Button btndos;
    LinearLayout contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments01);

        btnuno = findViewById(R.id.btn1);
        btndos = findViewById(R.id.btn2);
        contenedor = findViewById(R.id.layutContenedor);

        //HANDLER
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment01Interfaz1 fragmento1 = new Fragment01Interfaz1();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.layutContenedor,fragmento1).commit();
            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment01Interfaz2 fragmento2 = new Fragment01Interfaz2();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.layutContenedor,fragmento2).commit();
            }
        });
    }
}
