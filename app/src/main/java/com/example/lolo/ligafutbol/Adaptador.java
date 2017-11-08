package com.example.lolo.ligafutbol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lolo on 04/11/2017.
 */

// METODOS HEREDADOS

public class Adaptador extends BaseAdapter { //personalizar un listview

    Context context;
    List<Equipo> listaEquipos;

    //constructor

    public Adaptador(Context context,List<Equipo> listaEquipos){
        this.context=context;
        this.listaEquipos=listaEquipos;
    }

    @Override
    public int getCount() {
        return listaEquipos.size();
    } //tamaño array

    @Override
    public Object getItem(int i) {
        return listaEquipos.get(i);
    } //coge el equipo de esa posicion

    @Override
    public long getItemId(int i) {
        return listaEquipos.get(i).getId();
    } //coge el atributo id

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //esto para hacer una fila por cada item

        View vista=view;
        LayoutInflater inflate= LayoutInflater.from(context);
        vista=inflate.inflate(R.layout.equipos_item,null); //pide un layout
                                //  LAYOUT ,     VIEW GROUP

        //aqui le meto todos los componentes que hay en equipos_item

        TextView txtClub = vista.findViewById(R.id.txtClub);
        TextView txtPuntos = vista.findViewById(R.id.txtPuntos);
        ImageView icono = vista.findViewById(R.id.icono);


        txtClub.setText(listaEquipos.get(i).getNombre());
        txtPuntos.setText(Integer.toString(listaEquipos.get(i).getPuntos()));
        icono.setImageResource(listaEquipos.get(i).getIcono());

        return vista;
    }
}
