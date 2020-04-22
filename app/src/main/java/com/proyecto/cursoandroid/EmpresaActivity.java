package com.proyecto.cursoandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmpresaActivity extends AppCompatActivity {

    ListView listaemprsa;
    ArrayList<Empresa> datos ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        listaemprsa = findViewById(R.id.lstEmpresa);

        datos = new ArrayList<>();
        datos.add(new Empresa(1,"Titulo 1","Detalle 1"));
        datos.add(new Empresa(2,"Titulo 2","Detalle 2"));
        datos.add(new Empresa(3,"Titulo 3","Detalle 3"));
        datos.add(new Empresa(4,"Titulo 4","Detalle 4"));
        datos.add(new Empresa(5,"Titulo 5","Detalle 5"));

        ArrayAdapter<Empresa> adaptador = new ArrayAdapter<Empresa>(getApplicationContext(),R.layout.listviewpropio,R.id.txtTitulo,datos) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View vista = super.getView(position, convertView, parent);
                TextView titulo = vista.findViewById(R.id.txtTitulo);
                TextView detalle = vista.findViewById(R.id.txtDetalle);

                titulo.setText(datos.get(position).getTitulo());
                detalle.setText(datos.get(position).getDetalle());

                //COLOREAR TEXTO
                titulo.setTextColor(Color.BLACK);
                detalle.setTextColor(Color.GRAY);
                return vista;
            }
        };
        listaemprsa.setAdapter(adaptador);

        //llamar al metodo
        listaemprsa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Empresa retorno = datos.get(position);
                Intent retornoForm = getIntent();
                retornoForm.putExtra("retorno",retorno);
                setResult(RESULT_OK,retornoForm);
                finish();
            }
        });

    }
}
