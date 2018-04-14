package com.example.rafaj.fragmentapp;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Carlos on 14/4/2018.
 */

public class planetas implements Parcelable {
    private String[] informacion;
    private String[] nombrePlaneta;
    private String planeta;
    private String info;
    private String rutaImagen;
    private String key;
    private String pack;
    private Resources resources;


    protected planetas(Parcel in, String pack) {
        this.pack=pack;
        informacion= resources.getStringArray(R.array.informacion);
        nombrePlaneta= resources.getStringArray(R.array.Planets);
    }

    public static final Creator<planetas> CREATOR = new Creator<planetas>() {
        @Override
        public planetas createFromParcel(Parcel in) {
            return new planetas(in);
        }

        @Override
        public planetas[] newArray(int size) {
            return new planetas[size];
        }
    };

    public planetas(Parcel in) {

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
        dest.writeString(String.valueOf(informacion));
        dest.writeString(String.valueOf(nombrePlaneta));
        dest.writeString(rutaImagen);
        dest.writeString(key);
    }

    public void setKey(String key) {
        this.key = key;
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
