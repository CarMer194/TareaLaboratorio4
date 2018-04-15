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
    Planetas planeta;
    Uri imageuri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = findViewById(R.id.textId);
        text2 = findViewById(R.id.informacion);
        imagen= findViewById(R.id.imagen);

        //Intent callingIntent = getIntent();
        /*String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();*/

        planeta = getIntent().getExtras().getParcelable("planeta");
        System.out.println(planeta.getPlaneta());
        handleReceivedText();
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

    private void handleReceivedText(){
        if (planeta.getPlaneta() != null){
            text1.setText(planeta.getPlaneta());
        }
        if (planeta.getInfo() != null){
            text2.setText(planeta.getInfo());
        }
        if (planeta.getRutaImagen() != null){
            imageuri = Uri.parse(planeta.getRutaImagen());
            imagen.setImageURI(imageuri);
        }

    }
}
