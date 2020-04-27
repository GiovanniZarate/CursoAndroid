package com.proyecto.cursoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuContextual extends AppCompatActivity {

    ListView lista;
    String[] datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contextual);

        lista = findViewById(R.id.lstDatos);

        //CARGAR DATOS EN UN ARRAY PARA MOSTRAR EN LA LISTA
        datos =
                new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);
        lista.setAdapter(adaptador);

        //
        registerForContextMenu(lista);

    }
    //SOBREESCRIBIR EL METODO onCreateContextMenu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menucontextual,menu);

    }

    //SOBRERESCRIBIR METODO PARA MANEJAR EL ITEM SELECCIONADO
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(),"opcion 1 en elmento posicion "+datos[info.position],Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(),"opcion 2 en elmento posicion "+info.position,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(),"opcion 3 en elmento posicion "+info.position,Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
