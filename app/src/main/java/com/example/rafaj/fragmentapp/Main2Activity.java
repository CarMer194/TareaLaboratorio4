package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text1,text2;
    ImageView imagen;
    Uri imageuri;
    Planetas planeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text2 = findViewById(R.id.infos);
        imagen= findViewById(R.id.imagenes);
        text1 = findViewById(R.id.textId);


        Intent intent = getIntent();
        /*String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();*/
        if (intent.getParcelableExtra("planeta")!=null){
            planeta = intent.getParcelableExtra("planeta");
            System.out.println("Entro");
            System.out.println(planeta.getPlaneta());
        }


        handleReceived();
        /*imageuri = Uri.parse(planeta.getRutaImagen());
        text1.setText(planeta.getPlaneta());
        text2.setText(planeta.getInfo());
        imagen.setImageURI(imageuri);*/



        /*if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){

            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }*/

    }

    private void handleReceived(){
        if (planeta.getPlaneta() != null){
            text1.setText(planeta.getPlaneta());
            System.out.println("paso info de planeta");
        }
        if (planeta.getInfo() != null){
            text2.setText(planeta.getInfo());
            System.out.println("paso info");
        }
        if (planeta.getRutaImagen() != null){
            imageuri = Uri.parse(planeta.getRutaImagen());
            imagen.setImageURI(imageuri);
        }

    }
}
