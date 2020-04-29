package com.proyecto.cursoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SharedPreferences extends AppCompatActivity {

    TextView usuario;
    TextView clave;

    SessionManager manager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        manager = new SessionManager(getApplicationContext());

        usuario = findViewById(R.id.txtUser);
        clave = findViewById(R.id.txtCla);

        usuario.setText(manager.ObtenerDatos().getUsuario());
        clave.setText(manager.ObtenerDatos().getClave());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusharedpreferences,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                manager = new SessionManager(getApplicationContext());
                manager.logout();
                Intent paso = new Intent(getApplicationContext(),SharedPreferencesLogin.class);
                startActivity(paso);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
