package com.example.lolo.ligafutbol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEquipos;
    ArrayList<Equipo> listaEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VARIABLES Y COMPONENTES
        lvEquipos = (ListView) findViewById(R.id.ListViewEquipos);
        listaEquipos = new ArrayList<Equipo>();

        //OBJETOS DE EQUIPO

        listaEquipos.add(new Equipo(1,"Real Madrid", 24, 3, 50, 4, 23,R.drawable.realmadrid,R.drawable.realmadridplantilla,"http://www.realmadrid.com/"));
        listaEquipos.add(new Equipo(2,"Barcelona", 24, 3, 50, 4, 23,R.drawable.barca,R.drawable.barcaplantilla,"https://www.fcbarcelona.es/"));
        listaEquipos.add(new Equipo(3,"Sevilla", 24, 3, 50, 4, 23,R.drawable.sevilla,R.drawable.plantillasevilla,"http://www.sevillafc.es/"));
        listaEquipos.add(new Equipo(4,"Atleti", 24, 3, 50, 4, 23,R.drawable.atleti,R.drawable.plantillaatleti,"http://www.atleticodemadrid.com/"));


        //ADAPTADOR
        Adaptador myAdaptor = new Adaptador(getApplicationContext(), listaEquipos);
        lvEquipos.setAdapter(myAdaptor);



        lvEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() { //evento clicar
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //se escribe solo al meter la interfaz

                //RECOJO UN COCHE DE LA POSICION DE LA LIST VIEW
                Equipo equipucho = (Equipo) adapterView.getItemAtPosition(i); //si por ejemplo pulsas el item 7, i valdria 7

                //MANDO EL OBJETO SELECCIONADO EN EL LISTVIEW A MI NUEVO ACTIVITY DETALLE
                Intent e = new Intent(getApplicationContext(), Detalle_Activity.class); //intent es para mandar a otra activity
                e.putExtra("objeto", (Serializable) equipucho); //hay que mandarlo con serializable para poder acceder a la informacion
                startActivity(e);

            }
        });
    }
}
