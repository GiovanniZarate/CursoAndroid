package com.proyecto.cursoandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferencesLogin extends AppCompatActivity {

    EditText usuario;
    EditText clave;
    Button btnLogin;

    SessionManager managerusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_login);

        usuario = findViewById(R.id.editUsuario);
        clave = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);

        managerusuario = new SessionManager(getApplicationContext());

        //VERIFICAR SI YA ESTA LOGEADO PARA PASAR DIRECTO AL MENU
        if (managerusuario.isLogin()){
            Intent paso = new Intent(getApplicationContext(),SharedPreferences.class);
            startActivity(paso);
            finish();
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((usuario.getText().toString().contains("admin") )&&(clave.getText().toString().contains("admin")) ){
                    //Toast.makeText(getApplicationContext(),"todo ok", Toast.LENGTH_LONG).show();
                    managerusuario.RegistrarUsuario("admin","admin");
                    Intent paso = new Intent(getApplicationContext(),SharedPreferences.class);
                    startActivity(paso);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SharedPreferencesLogin.this);
                    builder.setMessage("Los datos ingresados no son correctos")
                            .setTitle("Login")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    usuario.setText("");
                                    clave.setText("");
                                }
                            });
                    builder.create();
                    builder.show();
                }
            }
        });
    }
}
