package com.proyecto.cursoandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReciclerViewAdaptador extends RecyclerView.Adapter<ReciclerViewHoder> {

    //Crear un List con la clase ReciclierViewFuente
    List<ReciclerViewFuente> listaobjeto;

    //se crea el metodo constructor
    public ReciclerViewAdaptador(List<ReciclerViewFuente> listaobjeto) {
        this.listaobjeto = listaobjeto;
    }

    @NonNull
    @Override
    public ReciclerViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new ReciclerViewHoder(vista,listaobjeto);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciclerViewHoder holder, int position) {
            holder.titulo.setText(listaobjeto.get(position).getTitulo());
            holder.imagen.setImageResource(listaobjeto.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaobjeto.size();
    }
}
