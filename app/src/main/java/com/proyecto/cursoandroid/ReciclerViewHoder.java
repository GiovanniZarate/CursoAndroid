package com.proyecto.cursoandroid;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ReciclerViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener {

    //
    Button btnuno;
    Button btndos;
    ImageView imagen;
    TextView titulo;

    //se agrega para trabajar con los objeto en el evento click
    List<ReciclerViewFuente> listaobjeto;

    //ESTE VA A SER EL ENCARGADO DE REGISTRAR EL ENLACE A LO QUE ES EL CARD_ITEM POR LO CUAL
    // SE DEBE DEFINIR LOS OBJETOS DEFINIDOS DENTRO DEL CARD_ITEM : TEXTVIEW,IMAGEVIEW, BUTTON , ETC
    public ReciclerViewHoder(@NonNull View itemView,List<ReciclerViewFuente> datos) {

        super(itemView);

        //REFERENCIAR A LOS OBJETOS DEL CARD_ITEM
        btnuno =itemView.findViewById(R.id.btnuno);
        btndos =itemView.findViewById(R.id.btndos);
        imagen = itemView.findViewById(R.id.imagen);
        titulo = itemView.findViewById(R.id.texto);

        //se carga datos
        listaobjeto = datos;


        //EVENTO CLICK DE LOS BOTONES ** SE COMENTA PORQUE SE IMPLEMENTA LA CLASE View.OnClickListener
       /* btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        //obtener la posicion de la fila selecciona
        int position = getAdapterPosition();
        //Aqui ya tenemos los datos del objeto selecciona sin realizar la serializacion
        ReciclerViewFuente objeto = listaobjeto.get(position);
        if (v.getId() == btnuno.getId()){
            Toast.makeText(btnuno.getContext(),"Apreto la opcion 1 del item "+position+ " correspondiente al titulo "+objeto.getTitulo(),Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(btndos.getContext(),"Apreto la opcion 2 del item "+position+ " correspondiente al titulo "+objeto.getTitulo(),Toast.LENGTH_SHORT).show();
        }
    }
}
