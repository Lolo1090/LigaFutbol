package com.example.lolo.ligafutbol;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle_Activity extends AppCompatActivity {

    ImageView fotoEquipo;
    TextView golesFavor,golesContra,rojas,amarillas;
    Button btnweb, btnCr7;

    //CREO UN OBJETO MEDIA PLAYER PARA EL SONIDO
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //COMPONENTES
        fotoEquipo=(ImageView)findViewById(R.id.fotoEquipo);
        golesFavor=(TextView)findViewById(R.id.golesFavor);
        golesContra=(TextView)findViewById(R.id.golesContra);
        rojas=(TextView)findViewById(R.id.rojas);
        amarillas=(TextView)findViewById(R.id.amarillas);
        btnweb=(Button)findViewById(R.id.btnWeb);
        btnCr7 = (Button) findViewById(R.id.btnCr7);

        //CREO UN OBJETO DE EQUIPO Y RECOJO LO QUE ME MANDO EL MAIN_ACTIVITY
        final Equipo equipucho = (Equipo) getIntent().getExtras().getSerializable("objeto");

        //ASIGNO EL TEXTO A CADA COMPONENTE

        fotoEquipo.setImageResource(equipucho.getPlantilla());
        golesFavor.setText( (String.valueOf(equipucho.getGolesFavor())));
        golesContra.setText((String.valueOf(equipucho.getGolesContra())));
        rojas.setText((String.valueOf(equipucho.getRojas())));
        amarillas.setText((String.valueOf(equipucho.getAmarillas())));

        //AQUI PONGO EL SONIDO      CONTEXT                             SONIDO/RAW/RES
        mp = MediaPlayer.create(getApplicationContext(), R.raw.cristiano_ronaldo_grito_balon_de_oro);

        //evento boton web
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TRATAMIENTO DE WEB
                Uri urlWeb = Uri.parse(equipucho.getUrl());
                Intent web = new Intent(Intent.ACTION_VIEW, urlWeb);
                startActivity(web);


            }
        });

        btnCr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //INICIO EL SONIDO CADA VEZ QUE LE DOY AL BOTON
                mp.start();


            }
        });


    }
}
