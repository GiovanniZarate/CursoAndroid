package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView02 extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view02);

        lista = findViewById(R.id.lstDatos);
        //definir array de tipo string
        final String[] info =
                new String[] {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6"};

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(getApplicationContext(),R.array.valores_array, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);

    }
}
