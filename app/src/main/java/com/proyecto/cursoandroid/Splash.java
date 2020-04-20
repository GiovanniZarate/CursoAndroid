package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //EJECUTAR UN HILO
        Thread threadSplah = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intentSplas = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intentSplas);
                    finish();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        };
        threadSplah.start();
    }
}
