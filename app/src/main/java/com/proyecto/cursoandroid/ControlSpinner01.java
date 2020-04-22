package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ControlSpinner01 extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_spinner01);

        spinner1 = findViewById(R.id.control1);
        spinner2 = findViewById(R.id.control2);

        final String[] info =
                new String[] {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6"};

        ArrayAdapter<String> adaptador1 = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,info);
        spinner1.setAdapter(adaptador1);

        //via xml
        ArrayAdapter<CharSequence> adaptador2 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.valores_array,android.R.layout.simple_spinner_item);
        spinner2.setAdapter(adaptador2);

        //enlazar al spiner 2
        //spinner2.setOnItemClickListener(evento);
        spinner2.setOnItemSelectedListener(evento1);
    }

    AdapterView.OnItemSelectedListener evento1 = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(),"Ojecto seleccionado "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };


}
