package com.proyecto.cursoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();  //Retorna cantidad de elemento de lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen = vista.findViewById(R.id.imageView);
        TextView titulo = vista.findViewById(R.id.txtTitulo);
        TextView descripcion = vista.findViewById(R.id.txtDescripcion);

        //CARGAMOS LOS VALORES EN EL LAYOUT ITEM
        titulo.setText(ListaObjetos.get(position).getTitulo());
        descripcion.setText(ListaObjetos.get(position).getDetalle());

        //para la imagen
        imagen.setImageResource(ListaObjetos.get(position).getImagen());


        return vista;
    }
}
