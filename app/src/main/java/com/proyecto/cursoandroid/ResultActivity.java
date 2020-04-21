package com.proyecto.cursoandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.file.Files;

public class ResultActivity extends AppCompatActivity {
    EditText editTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        editTexto = findViewById(R.id.editprovincia);
    }

    public void abrirActividad(View view) {
        Intent intent = new Intent(getApplicationContext(),ResultActivity2.class);
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 100){
            editTexto.setText(data.getExtras().getString("Resultado"));
        }else  {
            Toast.makeText(getApplicationContext(),"El Retorno No tiene datos ",Toast.LENGTH_SHORT).show();
        }
    }
}
