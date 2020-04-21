package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ControlCheckBox extends AppCompatActivity {

    CheckBox miControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_check_box);

        miControl = findViewById(R.id.chkControl);

        miControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean bandera =  ((CheckBox) v).isChecked();
                if (bandera){
                    Toast.makeText(getApplicationContext(),"Checkeado",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"No Checkeado",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
