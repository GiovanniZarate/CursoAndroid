package com.proyecto.cursoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridVeiw01Adaptador extends BaseAdapter {

    private Context contexto;
    private List<GridView01Datos> lista;

    public GridVeiw01Adaptador(Context contexto, List<GridView01Datos> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(contexto);
            convertView = inflater.inflate(R.layout.griditem,null);

            ImageView imagen = convertView.findViewById(R.id.imgPicture);
            TextView titulo = convertView.findViewById(R.id.txtTitulo);

            titulo.setText(lista.get(position).getTitulo().toString());
            imagen.setImageResource(lista.get(position).getImagen());


        //}
        return convertView;
    }
}
