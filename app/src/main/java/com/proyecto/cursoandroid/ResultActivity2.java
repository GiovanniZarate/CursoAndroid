package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResultActivity2 extends AppCompatActivity {

    EditText editretorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        editretorno = findViewById(R.id.editretorna);
    }

    public void eventoAceptar(View vista){
        if (editretorno.getText().length()!=0){
            Intent intentRetorno = getIntent();
            intentRetorno.putExtra("Resultado",editretorno.getText().toString());
            //se realiza de manera exitosa
            setResult(RESULT_OK,intentRetorno);
            finish();
        }else {
            Toast.makeText(getApplicationContext(),"No tiene datos ",Toast.LENGTH_SHORT).show();
        }
    }

    public void eventoCancelar(View vista){
        setResult(RESULT_CANCELED);
        finish();
    }
}
