package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text1,text2;
    Planetas planeta;
    ImageView imagenview;
    Uri imagenuri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text1 = view.findViewById(R.id.textId);
        text2 =view.findViewById(R.id.informacion);
        imagenview = view.findViewById(R.id.imagen);
        Bundle bundle = this.getArguments();


        if(bundle != null){
            //Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();
            //text1.setText(bundle.getString("KEY"));
            planeta= bundle.getParcelable("planeta");
        }

        if (planeta.getInfo()!= null){
            text2.setText(planeta.getInfo());
        }
        if (planeta.getPlaneta()!= null){
            text1.setText(planeta.getPlaneta());
        }
        if (planeta.getRutaImagen()!=null){
            System.out.println(planeta.getRutaImagen());
            imagenuri = Uri.parse(planeta.getRutaImagen());
            imagenview.setImageURI(imagenuri);

        }

        return view;
    }


}
