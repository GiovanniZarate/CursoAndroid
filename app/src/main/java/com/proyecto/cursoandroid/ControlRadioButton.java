package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ControlRadioButton extends AppCompatActivity {

    RadioGroup grupo;

    RadioButton rad1,rad2,rad3,rad4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_radio_button);
        grupo = findViewById(R.id.grupoRadio);
        grupo.clearCheck();
        grupo.check(R.id.rad3);

        rad1 = findViewById(R.id.rad1);
        rad2 = findViewById(R.id.rad2);
        rad3 = findViewById(R.id.rad3);
        rad4 = findViewById(R.id.rad4);

        rad1.setOnClickListener(evento);
        rad2.setOnClickListener(evento);
        rad3.setOnClickListener(evento);
        rad4.setOnClickListener(evento);

    }

    //SOBRESCRIBIR EL METODO ONCLICK
    View.OnClickListener evento = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.rad1:
                    Toast.makeText(getApplicationContext(),"Opcion 1",Toast.LENGTH_LONG).show();
                    break;
                case R.id.rad2:
                    Toast.makeText(getApplicationContext(),"Opcion 2",Toast.LENGTH_LONG).show();
                    break;
                case R.id.rad3:
                    Toast.makeText(getApplicationContext(),"Opcion 3",Toast.LENGTH_LONG).show();
                    break;
                case R.id.rad4:
                    Toast.makeText(getApplicationContext(),"Opcion 4",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };
}
