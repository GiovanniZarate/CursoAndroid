package com.proyecto.cursoandroid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogoSeleccionMultiple extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //return super.onCreateDialog(savedInstanceState);
        final String[] items =  {"Opcion 1","Opcion 2","Opcion 3"};
        final boolean[] itemchecked = {true,true,false};
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Seleccion Multiple")
                .setMultiChoiceItems(items, itemchecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        itemchecked[which] = isChecked;
                        Toast.makeText(getActivity(),"apreto la opcion "+items[which] + "estado "+builder,Toast.LENGTH_LONG).show();
                    }
                });

        return builder.create();
    }
}
