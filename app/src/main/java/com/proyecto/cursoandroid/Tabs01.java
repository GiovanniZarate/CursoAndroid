package com.proyecto.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class Tabs01 extends AppCompatActivity {

    TabHost contenedortab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs01);

        contenedortab = findViewById(R.id.contenedortabs);
        contenedortab.setup();

        //AGREGAR LOS TABS Y PONDERLE TITULO E IMAGNE
        TabHost.TabSpec spect1 = contenedortab.newTabSpec("mitab1");
        spect1.setContent(R.id.tab1);
        spect1.setIndicator("",getResources().getDrawable(android.R.drawable.ic_dialog_dialer));
        contenedortab.addTab(spect1);

        TabHost.TabSpec spect2 = contenedortab.newTabSpec("mitab2");
        spect2.setContent(R.id.tab2);
        spect2.setIndicator("",getResources().getDrawable(android.R.drawable.ic_input_add));
        contenedortab.addTab(spect2);

        TabHost.TabSpec spect3 = contenedortab.newTabSpec("mitab3");
        spect3.setContent(R.id.tab3);
        spect3.setIndicator("",getResources().getDrawable(android.R.drawable.ic_lock_lock));
        contenedortab.addTab(spect3);

        //primer tab que se va a mostrar
        contenedortab.setCurrentTab(0);

        contenedortab.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(getApplicationContext(),"Se apreto la pestaña "+tabId,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
