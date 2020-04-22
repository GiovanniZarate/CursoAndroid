package com.proyecto.cursoandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PaisActivity extends AppCompatActivity {

    ListView listapais;
    ArrayList<Pais> datos ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);

        listapais = findViewById(R.id.lstPais);

        //AGREGAR EN LA CLASE OBJEO PAIS DATOS
        datos = new ArrayList<>();
        datos.add(new Pais(1,"Paraguay"));
        datos.add(new Pais(2,"Uruguay"));
        datos.add(new Pais(3,"Chile"));
        datos.add(new Pais(4,"Peru"));
        datos.add(new Pais(5,"Bolivia"));

        //CREAR EL ARRAYADAPTER
        ArrayAdapter<Pais> adaptaor = new ArrayAdapter<Pais>(getApplicationContext(),android.R.layout.simple_list_item_1,datos){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View vista = super.getView(position, convertView, parent);
                TextView texto1 = vista.findViewById(android.R.id.text1);
                texto1.setText(datos.get(position).getDetalle());
                return vista;
            }
        };
        listapais.setAdapter(adaptaor);

        //llamar al metodo
        listapais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pais retorno = datos.get(position);
                Intent retornoForm = getIntent();
                retornoForm.putExtra("retorno",retorno);
                setResult(RESULT_OK,retornoForm);
                finish();
            }
        });
    }
}
