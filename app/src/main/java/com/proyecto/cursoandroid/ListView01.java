package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListView01 extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view01);

        lista = findViewById(R.id.lstDatos);
        //definir array de tipo string
        final String[] info = new String[] {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6"};

        //se configura el adapter
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,info);
        lista.setAdapter(adaptador);

        //Implementer el oncliclist
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Opcion seleccionada "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
