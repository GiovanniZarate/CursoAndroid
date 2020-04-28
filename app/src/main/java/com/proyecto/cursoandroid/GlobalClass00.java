package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

public class GlobalClass00 extends AppCompatActivity {

    TextView nombre;
    TextView apelllido;
    TextView dni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_class00);

        nombre = findViewById(R.id.txtANombre);
        apelllido = findViewById(R.id.txtAApellido);
        dni = findViewById(R.id.txtADni);

        GlobalClass objGlobal = (GlobalClass) getApplicationContext();

        objGlobal.setNombre("Giovanni ");
        objGlobal.setApellido("Zarate");
        objGlobal.setDni("4203593");

        GlobalClass objLectura = (GlobalClass) getApplicationContext();
        nombre.setText(objLectura.getNombre());
        apelllido.setText(objLectura.getApellido());
        dni.setText(objLectura.getDni());



        //AGREGAR EL FRAGMENTO DENTRO DEL LINEAR LAYOUT
        GlobalClassFragment1 fragmento = new GlobalClassFragment1();
        FragmentManager manejador = getSupportFragmentManager();
        manejador.beginTransaction().replace(R.id.area,fragmento).commit();
    }
}
