package com.proyecto.cursoandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListView03 extends AppCompatActivity {

    Button btnPais,btnEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view03);

        btnPais = findViewById(R.id.btnPais);
        btnEmpresa = findViewById(R.id.btnEmpresa);

        //CREAR EL HANDLER
        btnPais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intPais = new Intent(getApplicationContext(),PaisActivity.class);
                startActivityForResult(intPais,1000);
            }
        });

        btnEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intEmpresa = new Intent(getApplicationContext(),EmpresaActivity.class);
                startActivityForResult(intEmpresa,2000);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            Pais retorno = (Pais) data.getExtras().getSerializable("retorno");
            btnPais.setText(retorno.getDetalle());
        }

        //PARA EL RETORNO DE EMPRESA
        if (requestCode == 2000) {
            Empresa retorno = (Empresa) data.getExtras().getSerializable("retorno");
            btnEmpresa.setText(retorno.getDetalle());
        }
    }
}
