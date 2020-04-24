package com.proyecto.cursoandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.cursoandroid.fuente.Publicacion;

import java.util.List;

public class AdaptadorRedSocial extends RecyclerView.Adapter<miHolderRedSocial> {

    List<Publicacion> listaObjetos;

    public AdaptadorRedSocial(List<Publicacion> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    @NonNull
    @Override
    public miHolderRedSocial onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardfacebook,parent,false);
        return new miHolderRedSocial(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull miHolderRedSocial holder, int position) {
        holder.imagenUsuario.setImageResource(listaObjetos.get(position).getPropietario().getImagen());
        holder.textoUsuario.setText(listaObjetos.get(position).getPropietario().getNombre());
        holder.titulo.setText(listaObjetos.get(position).getTitulo());
        holder.resumen.setText(listaObjetos.get(position).getResumen());
        holder.imagenPublicacion.setImageResource(listaObjetos.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return listaObjetos.size();
    }
}
