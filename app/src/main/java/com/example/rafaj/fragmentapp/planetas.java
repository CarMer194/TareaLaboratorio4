package com.example.rafaj.fragmentapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Carlos on 14/4/2018.
 */

public class planetas implements Parcelable {
    private String informacion;
    private String nombrePlaneta;
    private String rutaImagen;


    public planetas() {
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
