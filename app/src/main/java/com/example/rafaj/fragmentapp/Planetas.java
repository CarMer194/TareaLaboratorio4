package com.example.rafaj.fragmentapp;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import java.util.Arrays;

/**
 * Created by Carlos on 14/4/2018.
 */

public class Planetas implements Parcelable {
    private String[] informacion;
    private String[] nombrePlaneta;
    private String planeta;
    private String info;
    private String rutaImagen;
    private String pack;



    protected Planetas(View view) {
        this.pack="com.example.rafaj.fragmentapp";

        informacion= view.getResources().getStringArray(R.array.informacion);
        nombrePlaneta= view.getResources().getStringArray(R.array.Planets);
    }

    public static final Creator<Planetas> CREATOR = new Creator<Planetas>() {
        @Override
        public Planetas createFromParcel(Parcel in) {
            return new Planetas(in);
        }

        @Override
        public Planetas[] newArray(int size) {
            return new Planetas[size];
        }
    };

    public Planetas(Parcel in) {

    }

    public void setInfo(int llave){
        if (llave==0){
            rutaImagen="android.resource://" + pack + "/drawable/" + "sol" ;
            planeta= nombrePlaneta[0];
            info= informacion[0];
        }
        if (llave==1){
            rutaImagen="android.resource://" + pack + "/drawable/" + "mercurio" ;
            planeta= nombrePlaneta[1];
            info= informacion[1];
        }
        if (llave==2){
            rutaImagen="android.resource://" + pack + "/drawable/" + "venus" ;
            planeta= nombrePlaneta[2];
            info= informacion[2];
        }
        if (llave==3){
            rutaImagen="android.resource://" + pack + "/drawable/" + "tierra" ;
            planeta= nombrePlaneta[3];
            info= informacion[3];
        }
        if (llave==4){
            rutaImagen="android.resource://" + pack + "/drawable/" + "marte" ;
            planeta= nombrePlaneta[4];
            info= informacion[4];
        }
        if (llave==5){
            rutaImagen="android.resource://" + pack + "/drawable/" + "jupiter" ;
            planeta= nombrePlaneta[5];
            info= informacion[5];
        }
        if (llave==6){
            rutaImagen="android.resource://" + pack + "/drawable/" + "saturno" ;
            planeta= nombrePlaneta[6];
            info= informacion[6];
        }
        if (llave==7){
            rutaImagen="android.resource://" + pack + "/drawable/" + "urano" ;
            planeta= nombrePlaneta[7];
            info= informacion[7];
        }
        if (llave==8){
            rutaImagen="android.resource://" + pack + "/drawable/" + "neptuno" ;
            planeta= nombrePlaneta[8];
            info= informacion[8];
        }

    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Arrays.toString(informacion));
        dest.writeString(Arrays.toString(nombrePlaneta));
        dest.writeString(rutaImagen);
        dest.writeString(planeta);
        dest.writeString(info);
    }

    public void readFromParcel (Parcel in){
        in.readStringArray(informacion);
        in.readStringArray(nombrePlaneta);
        rutaImagen = in.readString();
        planeta=in.readString();
        info=in.readString();
    }


    public String getPlaneta() {
        return planeta;
    }

    public String getInfo() {
        return info;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
}
