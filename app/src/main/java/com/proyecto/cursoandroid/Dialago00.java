package com.proyecto.cursoandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dialago00 extends AppCompatActivity {

    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;

    Button btnTresuno;
    Button btnSeis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialago00);

        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);

        btnTresuno = findViewById(R.id.btnTres1);
        btnSeis = findViewById(R.id.btnSeis);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hola Mundo 1",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Hola Mundo 2",Toast.LENGTH_LONG).show();

                Toast msg1 =  Toast.makeText(getApplicationContext(),"Hola Mundo 3",Toast.LENGTH_LONG);
                msg1.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
                msg1.show();

                LayoutInflater inflater = getLayoutInflater();
                View layo = inflater.inflate(R.layout.temporal, (ViewGroup) findViewById(R.id.contenedordialogo));
                TextView texto = layo.findViewById(R.id.texto);
                texto.setText("Hola mundo personalizado");
                Toast msgp = new Toast(getApplicationContext());
                msgp.setDuration(Toast.LENGTH_LONG);
                msgp.setView(layo);
                msgp.show();


            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //BOTON DIALOGO
                FragmentManager manager = getSupportFragmentManager();
                DialogoAlerta dialogo = new DialogoAlerta();
                dialogo.show(manager,"tagAlerta");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                DialogoSeleccion dialogo = new DialogoSeleccion();
                dialogo.show(manager,"tagAlerta");

                //DialogoSeleccion2 dialogo2 = new DialogoSeleccion2();
                //dialogo2.show(manager,"tagAlerta");
            }
        });

        btnTresuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                DialogoSeleccion2 dialogo2 = new DialogoSeleccion2();
                dialogo2.show(manager,"tagAlerta");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                DialogoSeleccionMultiple dialogo = new DialogoSeleccionMultiple();
                dialogo.show(manager,"tagAlerta");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                DialogoConfirmacion dialogo = new DialogoConfirmacion();
                dialogo.show(manager,"tagAlerta");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layo = inflater.inflate(R.layout.dialogo_personalizado, (ViewGroup) findViewById(R.id.contenedorPersonalizado));

                //DEFINIR EL builder
                AlertDialog.Builder builder = new AlertDialog.Builder(Dialago00.this);
                builder.setView(layo);
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create();
                builder.show();

            }
        });

    }
}
