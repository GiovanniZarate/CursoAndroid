package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSumar;
    EditText edit1;
    EditText edit2;

    TextView textresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //COMENTARIO PARA PROBAR MI COMMITE AL CMABIO EN GITHUB


        btnSumar = findViewById(R.id.btnsumar);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        textresultado = findViewById(R.id.textresultado);



        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.valueOf(edit1.getText().toString());
                double valor2 = Double.valueOf(edit2.getText().toString());
                double resultado = valor1 + valor2;

                textresultado.setText(String.valueOf(resultado));
            }
        });
    }
}
