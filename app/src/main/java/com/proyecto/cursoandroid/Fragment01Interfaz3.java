package com.proyecto.cursoandroid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment01Interfaz3 extends Fragment {

    private Button btnSumar;
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    public Fragment01Interfaz3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragment01_interfaz3, container, false);
        btnSumar = vista.findViewById(R.id.btnSumar);
        numero1 = vista.findViewById(R.id.txtuno);
        numero2 = vista.findViewById(R.id.txt2);
        resultado = vista.findViewById(R.id.txtResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double calculosuma = Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero2.getText().toString());
                resultado.setText(calculosuma.toString());
            }
        });

        return vista;

    }
}
