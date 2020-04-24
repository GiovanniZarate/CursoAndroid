package com.proyecto.cursoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }

    //VAMOS A SOBREESCRIBIR EL METODO onCreateOptionMenu y asociar al menu.xml creado
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal,menu);
        return true;
    }

    //SOBRESSCRIBIR EL METODO  onOptionsItemSelected PARA DARLE ACCION A LOS ITEMS DEL MENU


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),"Opcion 1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),"Opcion 2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(),"Opcion 2",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
