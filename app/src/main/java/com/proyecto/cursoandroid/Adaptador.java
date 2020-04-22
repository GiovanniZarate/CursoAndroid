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

    //VIEW HOLDER SE IMPLEMENTA AQUI
    static class viewHolder{
       private ImageView imagen ;
       private TextView titulo ;
       private TextView descripcion;
       //se crea el metodo contructor y recibe vista
        public viewHolder(View vista){
             imagen = vista.findViewById(R.id.imageView);
             titulo = vista.findViewById(R.id.txtTitulo);
             descripcion = vista.findViewById(R.id.txtDescripcion);
        }

    }

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

        //se crea un objeto tipo Viewholder
        viewHolder holder;
        View vista = convertView;

        //SE AGREGA EL PROCESO DE INFLADO Y VINCULACION DE LOS DATOS SOLO SE REALICE UNA VEZ
        //ANTES SE REALIZABA POR CADA ITEM ESO EVITA EL USO DEL HOLDER
        //SER REALIZARA UNA SOLA VEZ
        if (vista == null){
            LayoutInflater inflate = LayoutInflater.from(contexto);
            vista = inflate.inflate(R.layout.itemlistview,null);
            holder = new viewHolder(vista);
            vista.setTag(holder); //se guarda temporalmente
        }else{
            holder = (viewHolder) vista.getTag(); //RECUPERA EL TAG SI LA VISTA YA ESTA CARGADA
        }

        //YA NO SE HACE ACA ESTO
        /*ImageView imagen = vista.findViewById(R.id.imageView);
        TextView titulo = vista.findViewById(R.id.txtTitulo);
        TextView descripcion = vista.findViewById(R.id.txtDescripcion);*/

        //CARGAMOS LOS VALORES EN EL LAYOUT ITEM
        //YA NO SE CARGA ASI
       /* titulo.setText(ListaObjetos.get(position).getTitulo());
        descripcion.setText(ListaObjetos.get(position).getDetalle());
        //para la imagen
        imagen.setImageResource(ListaObjetos.get(position).getImagen());*/

        //AHORA SE CARGA POR VIEWHOLDER
        Datos objeto = ListaObjetos.get(position);

        holder.imagen.setImageResource(objeto.getImagen());
        holder.descripcion.setText(objeto.getDetalle());
        holder.titulo.setText(objeto.getTitulo());


        return vista;
    }
}
