package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    int operacion;
    Double numero1, numero2;
    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txtresultado = findViewById(R.id.txtresultado);
    }

    public void iniciar(){
        numero1 = 0.0;
        numero2 = 0.0;
        operacion = 0;
        txtresultado.setText("0");
    }
    //PARA LIMPIAR METODO
    public void Limpiar(View view){
        iniciar();
    }

    public void cargarnumero(View view){
        Button accion = (Button) view;
        //para que no empiece con cero
        if (txtresultado.getText().equals("0")) txtresultado.setText("");
        txtresultado.setText(txtresultado.getText() + accion.getText().toString());
    }

    public void operacion(View view){
        Button accion = (Button) view;
        switch (accion.getText().toString()){
            case "-":
                operacion = 1;
                break;
            case "+":
                operacion = 2;
                break;
            case "*":
                operacion = 3;
                break;
            case "/":
                operacion = 4;
                break;
        }

        numero1 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
    }

    public void igual(View view){
        numero2 = Double.parseDouble(txtresultado.getText().toString());
        Double rest = 0.0;
        switch (operacion){
            case 1:
                 rest = (numero1 - numero2);
                 break;
            case 2:
                rest = (numero1 + numero2);
                break;
            case 3:
                rest = (numero1 * numero2);
                break;
            case 4:
                rest = (numero1 / numero2);
                break;
        }
        txtresultado.setText(rest.toString());
    }
}
